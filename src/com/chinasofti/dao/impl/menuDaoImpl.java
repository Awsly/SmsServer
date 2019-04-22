package com.chinasofti.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.chinasofti.dao.menuDao;
import com.chinasofti.domain.kind;
import com.chinasofti.domain.menu;
import com.chinasofti.util.DBUtil;

public class menuDaoImpl implements menuDao {
	Scanner sc=new Scanner(System.in);
	//创建dbutil变量
	private DBUtil db;


	//增加蔬菜种类
	@Override
	public boolean Addvegetables(kind k) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="insert into kind values(?,?)";
		int i;
		try {
			i = this.db.update(sql,k.getkid(),k.getkname());
			return i>0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}


	}

	//查询蔬菜种类
	@Override
	public List<kind> Selectvegetables() {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="select * from kind";
		ResultSet se;
		try {
			se = this.db.query(sql);
			//创建一个list集合用于存储所有的菜单
			List<kind> list=new ArrayList<kind>();
			while(se.next()){
				list.add(new kind(se.getInt("kid"), se.getString("kname")));
			}
			return list;
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;	
	}

	//修改菜品种类
	@Override
	public boolean Updatevegetables(kind k) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="update kid set mmname=? and price=? where kid";
		int i;
		try {
			i = this.db.update(sql);
			return i>0;
		} catch (SQLException e) {
			return false;
		}
	}

	//删除菜品种类
	@Override
	public boolean Deletevegetables(int id) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="delete from kind where kid="+id;
		int i;
		try {
			i = this.db.update(sql);
			return i>0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

	}

	

	//添加菜单的方法
	@Override
	public boolean Addgreens(menu m) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="insert into menu(mmid,mmname,peice,kid) values(?,?,?,?)";
		try {
			int i = this.db.update(sql,m.getmmid(),m.getmmname(),m.getprice(),m.getkid());
			return i>0;
		} catch (SQLException e) {
			System.out.println("出现了错误~");
			return false;
		}
	}

	//查询菜单的方法
	@Override
	public List<menu> Selectgreens() {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="select * from menu";
		ResultSet se;
		try {
			se = this.db.query(sql);
			//创建一个list集合用于存储所有的菜单
			List<menu> list=new ArrayList<menu>();
			while(se.next()){
				list.add(new menu(se.getInt("mmid"), se.getString("mmname"),se.getDouble("price"),se.getInt("kid")));
			}
			return list;
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;	
	}

	//修改菜单的方法 	
	@Override
	public boolean Updategreens(int id) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		System.out.print("员工id：");
		String mmname=sc.next();
		System.out.print("员工姓名：");
		double price=sc.nextDouble();

		String sql="update menu set mmname=? and price=? where mmid="+id;
		int i;
		try {
			i = this.db.update(sql,mmname,price);
			return i>0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}


	}

	//删除菜单的方法
	@Override
	public boolean Deletegreens(int id) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="delete from menu where mmid="+id;
		int i;
		try {
			i = this.db.update(sql);
			return i>0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}


	}



}
