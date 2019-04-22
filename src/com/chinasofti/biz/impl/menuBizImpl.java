package com.chinasofti.biz.impl;

import java.util.List;

import com.chinasofti.biz.menuBiz;
import com.chinasofti.dao.menuDao;
import com.chinasofti.domain.kind;
import com.chinasofti.domain.menu;

public class menuBizImpl implements menuBiz {
	public menuDao meDao;
	
	//添加菜类
		@Override
		public String Addvegetables(int kid,String kname) {
			return this.meDao.Addvegetables(new kind(kid,kname))?"添加成功!":"添加失败!";
		}

		//查询所有菜类
		@Override
		public List<kind> Selectvegetables() {
			return this.meDao.Selectvegetables();
		}

		//修改菜类
		@Override
		public String Updatevegetables(int id) {
			//return this.meDao.Updatevegetables(id)?"修改成功!":"修改失败!";
			return "";
		}

		//删除菜类
		@Override
		public String Deletevegetables(int id) {
			return this.meDao.Deletevegetables(id)?"删除成功！":"删除失败！";
		}
	
	
	
	
	//添加菜单
	@Override
	public String Addgreens(int mmid, String mmname, double price, int kid) {
		//return this.meDao.Addgreens(new menu(mmid,mmname,price,kid)?"添加成功！":"添加失败！");
		return "";
	}

	//查询所有菜单
	@Override
	public List<menu> Selectgreens() {
		return this.meDao.Selectgreens();
	}

	//修改菜单菜品
	@Override
	public String Updategreens(int id) {
		return this.meDao.Updategreens(id)?"修改成功!":"修改失败!";
	}

	//删除菜单菜品
	@Override
	public String Deletegreens(int id) {
		return this.meDao.Deletegreens(id)?"删除成功!":"删除失败!";
	}

	

	
}
