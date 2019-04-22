package com.chinasofti.control;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class control {
	//服务器端
    private ServerSocket server;  
    private final int PORT=1240;
    private SMSService service;
	public control() {
		super();
		try {
			System.out.println("服务器正在开启中");
			this.server=new ServerSocket(PORT);
			Thread.sleep(1000);
			System.out.println("服务器已经开启中");
			this.service=new SMSServiceimpl();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void start(){
    	while(true){
    		//等待客户连接
    		try {
				Socket client=this.server.accept();
				System.out.println("用户"+client.getInetAddress().getHostAddress()+"已连接");
				//创建线程对象
				controlThread ct=new controlThread(client,service);
				ct.start();
			} catch (IOException e) {
				e.printStackTrace();
			}
    	}
    } 
    
}
