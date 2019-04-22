package com.chinasofti.biz;

import java.util.List;

import com.chinasofti.domain.shopcar;


//员工业务类
public interface employeeBiz {
	//1、点菜进购物车业务
	public String Addshopcar(int id);
	//2、删除购物车菜品业务
	public String Deleteshopcar(int id);
	//3、查询购物车菜品业务
	public List<shopcar> Selectshopcar();
}
	