package com.chinasofti.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chinasofti.dao.employeeDao;
import com.chinasofti.domain.shopcar;
import com.chinasofti.studentmanager.util.DBUtil;

public class employeeDaoImpl implements employeeDao {
	//创建dbutil变量
	private DBUtil db;
	//添加购物车
	@Override
	public boolean addshopcar(int id) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="insert into shop(mmid,mmname,price) select mmid,mmname,price from menu where mmid="+id;  //有问题,尚未解决
		try {
			int i = this.db.update(sql);
			return i>0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	//删除购物车
	@Override
	public boolean Deleteshopcar(int id) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="delete from shop where mmid="+id;
		try {
			int i=this.db.update(sql);
			return i>0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	//查询购物车
	@Override
	public List<shopcar> Selectshopcar() {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="select * from shop";
		ResultSet se;
		try {
			se = this.db.query(sql);
			//创建一个list集合用于存储所有的课程
			List<shopcar> list=new ArrayList<shopcar>();
			while(se.next()){
				list.add(new shopcar(se.getInt("mmid"),se.getString("mmname"),se.getDouble("price")));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}
}
