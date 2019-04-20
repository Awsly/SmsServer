package com.chinasofti.biz.impl;

import java.util.List;

import com.chinasofti.biz.managerBiz;
import com.chinasofti.dao.managerDao;
import com.chinasofti.domain.employee;
import com.chinasofti.domain.statistics;
import com.chinasofti.domain.vip;

public class managerBizImpl implements managerBiz {
	public managerDao manDao;
	@Override
	public String addemployee(int eid, String ename, String esex, int age, String address) {
		return this.manDao.Addemployee(new employee(eid,ename,esex,age,address))?"添加成功！":"添加失败！";

	}

	@Override
	public List<employee> Selectemployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public employee Selectemployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Updateemployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Deleteemployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<statistics> Statistics() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<vip> Selectvip(int id) {
		// TODO Auto-generated method stub
		return null;
	}


}
