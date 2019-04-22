package com.chinasofti.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.chinasofti.dao.managerDao;
import com.chinasofti.domain.employee;
import com.chinasofti.domain.statistics;
import com.chinasofti.util.DBUtil;

public class manmagerDaoImpl implements managerDao {
	Scanner sc=new Scanner(System.in);
	//创建dbutil变量
	private DBUtil db;
	
	//添加员工的实现
	@Override
	public boolean Addemployee(employee emp) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="insert into employee values(?,?,?,?,?)";
		try {
			int i = this.db.update(sql,emp.getEid(),emp.getEname(),emp.getEsex(),emp.getAge(),emp.getAddress());
			return i>0;
		} catch (SQLException e) {
			System.out.println("出现了错误~");
			return false;
		}

	}

	//查询所有员工的实现
	@Override
	public List<employee> Selectemployee() {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="select * from employee";
		ResultSet se;
		try {
			se = this.db.query(sql);
			//创建一个list集合用于存储所有的员工
			List<employee> list=new ArrayList<employee>();
			while(se.next()){
				list.add(new employee(se.getInt("eid"), se.getString("ename"),se.getString("esex"),se.getInt("age"),se.getString("address")));
			}
			return list;
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;

	}

	//通过id修改员工信息的实现
	@Override
	public boolean Updateemployee(int id) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="update employee set eid=?,ename=?,esex=?,age=?,address=? where eid="+id;
		try {

			System.out.print("员工id：");
			int ids=sc.nextInt();
			System.out.print("员工姓名：");
			String name=sc.next();
			System.out.print("员工性别：");
			String sex=sc.next();
			System.out.print("员工年龄：");
			int age=sc.nextInt();
			System.out.print("员工住址：");
			String address=sc.next();

			int i = this.db.update(sql,ids,name,sex,age,address);
			return i>0;

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	//通过id删除员工信息
	@Override
	public boolean Deleteemployee(int id) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="delete from employee where eid="+id;
		try {
			int i = this.db.update(sql);
			return i>0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	//账单统计  统计菜品卖出的数量
	@Override
	public List<statistics> Statistics() {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="select mmname 名称,count(*) 数量,sum(price) 总价格 from Statistics group by mmname";
		ResultSet se;
		try {
			se = this.db.query(sql);
			//创建一个list集合用于存储所有的员工
			List<statistics> list=new ArrayList<statistics>();
			while(se.next()){
				list.add(new statistics(se.getInt("mmid"),se.getString("mmname"),se.getDouble("price")));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	//通过id查找员工
	@Override
	public List<employee> Selectemployee(int id) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="select * from employee where eid="+id;
		ResultSet se;
		try {
			se = this.db.query(sql);
			//创建一个list集合用于存储所有的课程
			List<employee> list=new ArrayList<employee>();
			while(se.next()){
				list.add(new employee(se.getInt("eid"), se.getString("ename"),se.getString("esex"),se.getInt("age"),se.getString("address")));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	//冻结会员卡-----------------------------------------------------------------------失效方法
	@Override
	public boolean Freezecard(int id) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="update employee set  where eid="+id;  //有问题,尚未解决
		try {
			int i = this.db.update(sql);
			return i>0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	//会员卡挂失
	@Override
	public boolean Relieveloss(int id) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="update employee set  where eid="+id;  //有问题,尚未解决
		try {
			int i = this.db.update(sql);
			return i>0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	//修改优惠额度
	@Override
	public boolean Updatediscounts(int id) {
		return false;
	}

}
