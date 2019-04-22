package com.chinasofti.biz;

import java.util.List;

import com.chinasofti.domain.employee;
import com.chinasofti.domain.statistics;
import com.chinasofti.domain.vip;


//经理业务类
public interface managerBiz {
	//1、添加员工业务
	public String addemployee(int eid, String ename, String esex, int age, String address);
	//2、查询所有员工业务
	public List<employee> Selectemployee();
	//2、查询所有员工业务
	public List<employee> Selectemployee(int id);
	//3、修改员工业务
	public String Updateemployee(int id);
	//4、删除员工业务
	public String Deleteemployee(int id);
	//16、统计信息业务
	public List<statistics> Statistics();
	//17、通过ID查询会员信息业务
	public List<vip> Selectvip(int id);
}
