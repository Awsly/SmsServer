package com.chinasofti.biz.impl;

import java.util.List;

import com.chinasofti.biz.employeeBiz;
import com.chinasofti.dao.employeeDao;
import com.chinasofti.domain.shopcar;

public class employeeBizImpl implements employeeBiz {
	public employeeDao eDao;
	
	//增加购物车
	@Override
	public String Addshopcar(int id) {
		return this.eDao.addshopcar(id)?"添加成功!":"添加失败!";

	}

	//删除购物车
	@Override
	public String Deleteshopcar(int id) {
		return this.eDao.Deleteshopcar(id)?"删除成功!":"删除失败!";

	}
	//查询购物车
	@Override
	public List<shopcar> Selectshopcar() {
		return this.eDao.Selectshopcar();

	}

}
