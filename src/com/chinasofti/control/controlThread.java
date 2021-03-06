package com.chinasofti.control;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
//主要逻辑业务
public class controlThread extends Thread{
	private Socket client;
    //创建一个被代理的对象
	private Object o;
	public controlThread(Socket client,Object o) {
		super();
		this.client = client;
		this.o=o;
	}
	@Override
	public void run() {
		//获取输入流 用户接受客户端代理发送的方法名称 参数类型 参数列表
		try {
			ObjectInputStream ois=new ObjectInputStream(client.getInputStream());
			//获取方法名称
			String methodname = ois.readUTF();
			//获取方法参数类型
			Class<?>[ ] methodtypes=	(Class<?>[ ]) ois.readObject();
			//获取方法参数列表
			Object [ ] methodparams=(Object [ ]) ois.readObject();
			//获取方法对象
			Method method = o.getClass().getMethod(methodname, methodtypes);
			//执行该方法返回结果
			Object result = method.invoke(o,methodparams );
			//创建输出流将结果发送给客户端
			ObjectOutputStream out=new ObjectOutputStream(client.getOutputStream());
			out.writeObject(result);
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
	}
}
