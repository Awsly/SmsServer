package com.chinasofti.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chinasofti.dao.menuDao;
import com.chinasofti.domain.kind;
import com.chinasofti.domain.menu;
import com.chinasofti.studentmanager.util.DBUtil;

public class menuDaoImpl implements menuDao {
	//创建dbutil变量
	private DBUtil db;


	//添加菜单的方法
	@Override
	public boolean Addgreens(menu m) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="insert into menu values(?,?,?,?)";
		try {
			int i = this.db.update(sql,m.getMmid(),m.getMmname(),m.getPrice(),m.getKid());
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
	public boolean Updategreens() {
		return false;
	}

	@Override
	public boolean Deletegreens() {
		return false;
	}

	@Override
	public boolean Addvegetables() {
		return false;
	}

	@Override
	public List<kind> Selectvegetables() {
		return null;
	}

	@Override
	public boolean Updatevegetables() {
		return false;
	}

	@Override
	public boolean Deletevegetables() {
		return false;
	}

}
