package com.chinasofti.biz.impl;

import java.util.List;

import com.chinasofti.biz.managerBiz;
import com.chinasofti.dao.managerDao;
import com.chinasofti.dao.vipDao;
import com.chinasofti.domain.employee;
import com.chinasofti.domain.statistics;
import com.chinasofti.domain.vip;

public class managerBizImpl implements managerBiz {
	public managerDao manDao;
	public vipDao vDao;
	//添加员工信息
	@Override
	public String addemployee(int eid, String ename, String esex, int age, String address) {
		return this.manDao.Addemployee(new employee(eid,ename,esex,age,address))?"添加成功！":"添加失败！";

	}

	//查询员工信息
	@Override
	public List<employee> Selectemployee() {
		return this.manDao.Selectemployee();
	}

	//通过id查询员工信息
	@Override
	public List<employee> Selectemployee(int id) {
		return this.manDao.Selectemployee(id);
	}

	//通过id修改员工信息
	@Override
	public String Updateemployee(int id) {
		return this.manDao.Updateemployee(id)?"修改成功！":"修改失败！";
	}

	//通过id删除员工信息
	@Override
	public String Deleteemployee(int id) {
		return this.manDao.Deleteemployee(id)?"删除成功！":"删除失败！";
	}

	//统计信息
	@Override
	public List<statistics> Statistics() {
		return this.manDao.Statistics();
	}

	//查询会员信息
	@Override
	public List<vip> Selectvip(int id) {
		return this.vDao.selectvip(id);
	}


}
