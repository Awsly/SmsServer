package com.chinasofti.dao;

import java.util.List;
import com.chinasofti.domain.shopcar;

public interface employeeDao {
	//添加购物车菜品的方法
	public boolean addshopcar(int id);
	//删出购物车菜品的方法
	public boolean Deleteshopcar(int id);
	//查询购物车菜品的方法
	public List<shopcar> Selectshopcar();
	
}
