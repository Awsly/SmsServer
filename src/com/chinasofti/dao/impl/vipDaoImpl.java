package com.chinasofti.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chinasofti.dao.vipDao;
import com.chinasofti.domain.vip;
import com.chinasofti.util.DBUtil;

public class vipDaoImpl implements vipDao {
	//创建dbutil变量
	private DBUtil db;
	//添加vip用户
	@Override
	public boolean Applyvip(vip v) {

		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="insert into vip values(?,?,?,?,?)";
		try {
			int i = this.db.update(sql,v.getVid(),v.getVname(),v.getVsex(),v.getMoney(),v.getVlevel());
			return i>0;
		} catch (SQLException e) {
			System.out.println("出现了错误~");
			return false;
		}
	}

	//会员卡充值
	@Override
	public boolean Recharge(double money) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="update menu set money=money+"+money;
		int i;
		try {
			i = this.db.update(sql);
			return i>0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

	}

	//会员卡挂失 状态为1表示正常，为0表示冻结
	@Override
	public boolean Reportloss(int state) {

		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="update vipCard set state="+state;
		int i;
		try {
			i = this.db.update(sql);
			return i>0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	//会员信息查找
	@Override
	public List<vip> selectvip(int id) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="select * from vip where vid="+id;
		ResultSet se;
		try {
			se = this.db.query(sql);
			//创建一个list集合用于存储所有的菜单
			List<vip> list=new ArrayList<vip>();
			while(se.next()){
				list.add(new vip(se.getInt("vid"), se.getString("vname"),se.getString("vsex"),se.getDouble("money"),se.getString ("vlevel")));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;	
	}

}
