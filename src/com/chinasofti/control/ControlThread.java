package com.chinasofti.control;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import com.chinasofti.biz.employeeBiz;
import com.chinasofti.biz.managerBiz;
import com.chinasofti.domain.employee;





public class ControlThread extends Thread{
	private Socket client;
	//创建输入输出流
	private Scanner in;
	private PrintWriter out;
	//创建业务层对象
	public employeeBiz empBiz;
	public managerBiz manBiz;
	public ControlThread(Socket client) {
		super();
		this.client = client;
		//调用初始化输入输出流的方法
		this.getInAndOut();
	}

	//创建一个方法用户获取输入输出流
	private void getInAndOut(){
		try {
			in=new Scanner(client.getInputStream());
			out=new PrintWriter(client.getOutputStream());
		} catch (IOException e) {
		
			e.printStackTrace();
		}

	}

	//创建方法  接收整数的方法  接收字符串的方法  发送字符的方法    发送整数的方法
	private int getInt(){
		return Integer.parseInt(in.nextLine());
	}
	private String getString(){
		return in.nextLine();
	}
	private void sendString(String msg){
		out.println(msg);
		out.flush();
	}
	//创建一个发送对象的方法
	@SuppressWarnings("unused")
	private void sendObject(Object obj){
		try {
			ObjectOutputStream oos=new ObjectOutputStream(client.getOutputStream());
			oos.writeObject(obj);
			oos.flush();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

	@Override
	public void run(){

		while(true){
			//接收客户端输入的指令   程序流程
			int select;
			try{
				select=this.getInt();
				if(select==0){
					System.out.println(this.client.getInetAddress().getHostAddress()+"已断开！");
					break;
				}else if(select==1){
					//添加员工
					this.addemployee();
				}else if(select==2){
					
				}else if(select==3){
				
				}else if(select==4){
					
				}else if(select==5){
					
				}
			}catch(Exception e){
				System.out.println("用户"+client.getInetAddress().getHostAddress()+"已断开链接");
				break;
			}
		}

	}
	
	
	//登录
	public void link(){
		
	}
	//添加员工
	public void addemployee(){
		String s=this.getString();
		//进行拆分
		String []arr=s.split("#");
		//利用id查询员工是否存在
		employee emp=this.manBiz.Selectemployee(Integer.parseInt(arr[0]));
		if(emp!=null){
			this.sendString("对不起学生已存在");
			return ;
		}
		this.sendString(this.manBiz.addemployee(Integer.parseInt(arr[0]), arr[1],arr[2],Integer.parseInt(arr[3]),arr[4]));

	}
	

	
}






