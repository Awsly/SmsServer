package com.chinasofti.dao;

import java.util.List;

import com.chinasofti.domain.kind;
import com.chinasofti.domain.menu;

public interface menuDao {
	//增加菜品种类的方法
	public boolean Addgreens(menu m);
	//查询菜品种类的方法
	public List<menu> Selectgreens();
	//修改菜品种类的方法
	public boolean Updategreens();
	//删除菜品种类的方法
	public boolean Deletegreens();

	
	//增加菜品分类的方法
	public boolean Addvegetables();
	//查询菜品分类的方法
	public List<kind> Selectvegetables();
	//修改菜品分类的方法
	public boolean Updatevegetables();
	//删除菜品分类的方法
	public boolean Deletevegetables();
	
}
