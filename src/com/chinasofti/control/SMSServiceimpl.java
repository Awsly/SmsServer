package com.chinasofti.control;

import java.util.List;
import com.chinasofti.dao.employeeDao;
import com.chinasofti.dao.managerDao;
import com.chinasofti.dao.menuDao;
import com.chinasofti.dao.vipDao;
import com.chinasofti.domain.employee;
import com.chinasofti.domain.kind;
import com.chinasofti.domain.menu;
import com.chinasofti.domain.shopcar;
import com.chinasofti.domain.statistics;
import com.chinasofti.domain.vip;


public class SMSServiceimpl implements SMSService {
	public employeeDao eDao;
	public managerDao manDao;
	public vipDao vDao;
	public menuDao meDao;
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

	//添加员工信息
	@Override
	public String addemployee(int eid, String ename, String esex, int age, String address) {
		return this.manDao.Addemployee(new employee(eid,ename,esex,age,address))?"添加成功！":"添加失败！";

	}

	//查询员工信息
	@Override
	public List<employee> Selectemployee() {
		return this.manDao.Selectemployee();
	}

	//通过id查询员工信息
	@Override
	public List<employee> Selectemployee(int id) {
		return this.manDao.Selectemployee(id);
	}

	//通过id修改员工信息
	@Override
	public String Updateemployee(int id) {
		return this.manDao.Updateemployee(id)?"修改成功！":"修改失败！";
	}

	//通过id删除员工信息
	@Override
	public String Deleteemployee(int id) {
		return this.manDao.Deleteemployee(id)?"删除成功！":"删除失败！";
	}

	//统计信息
	@Override
	public List<statistics> Statistics() {
		return this.manDao.Statistics();
	}

	//查询会员信息
	@Override
	public List<vip> Selectvip(int id) {
		return this.vDao.selectvip(id);
	}

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
	//增加会员信息
	@Override
	public String Applyvip(int vid, String vname, String vsex, double money, String vlevel) {
		return this.vDao.Applyvip(new vip(vid,vname,vsex,money,vlevel))?"添加成功！":"添加失败！";
	}

	//会员卡充值
	@Override
	public String Recharge(double money) {
		return this.vDao.Recharge(money)?"充值成功！":"充值失败！";
	}

	//会员卡挂失
	@Override
	public String Reportloss(int id) {
		return this.vDao.Reportloss(id)?"挂失成功！":"挂失失败！";
	}

	//通过id查询会员卡
	@Override
	public List<vip> selectvip(int id) {
		return this.vDao.selectvip(id);
	}

	//会员卡冻结
	@Override
	public String Freezecard(int id) {
		return this.manDao.Freezecard(id)?"冻结成功！":"冻结失败！";
	}

	//会员卡解除挂失
	@Override
	public String Relieveloss(int id) {
		return this.manDao.Relieveloss(id)?"解除成功!":"解除失败!";
	}

	//修改优惠额度
	@Override
	public String Updatediscounts(int id) {
		return this.manDao.Updatediscounts(id)?"修改成功！":"修改失败！";
	}

}
