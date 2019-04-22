package com.chinasofti.dao;

import java.util.List;

import com.chinasofti.domain.employee;
import com.chinasofti.domain.statistics;

public interface managerDao {
	//添加员工的方法
	public boolean Addemployee(employee emp);
	//查询员工的方法
	public List<employee> Selectemployee();
	//修改员工的方法
	public boolean Updateemployee(int id);
	//删除员工的方法
	public boolean Deleteemployee(int id);
	//统计菜品销售量的方法
	public List<statistics> Statistics();
	//通过id查找员工的方法
	public List<employee> Selectemployee(int id);
	//冻结会员卡的方法
	public boolean Freezecard(int id);
	//解除会员卡挂失的方法
	public boolean Relieveloss(int id);
	//修改会员卡优惠额度的方法
	public boolean Updatediscounts(int id);
	
	
}
