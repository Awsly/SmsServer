package com.chinasofti.control;

import java.util.Iterator;
import java.util.List;

public class Watch extends Thread{
	private List<ControlThread>list;
	private Iterator<ControlThread> it;
	public Watch(List<ControlThread> list){
		super();
		this.list=list;
		//设置当前线程为守护线程
		this.setDaemon(true);
	}
	@Override
	public void run() {
		while(true){
			//获取迭代对象
			it=list.iterator();
			//遍历迭代器
			while(it.hasNext()){
				//判断迭代的每一个线程是否处于活跃状态
				if(!it.next().isAlive()){
					it.remove();
				}
			}
			try {
				Thread.sleep(1000*60*10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
