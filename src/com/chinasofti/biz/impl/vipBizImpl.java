package com.chinasofti.biz.impl;

import java.util.List;

import com.chinasofti.biz.vipBiz;
import com.chinasofti.dao.managerDao;
import com.chinasofti.dao.vipDao;
import com.chinasofti.domain.vip;

public class vipBizImpl implements vipBiz {
	public vipDao vDao;
	public managerDao mDao;
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
		return this.mDao.Freezecard(id)?"冻结成功！":"冻结失败！";
	}

	//会员卡解除挂失
	@Override
	public String Relieveloss(int id) {
		return this.mDao.Relieveloss(id)?"解除成功!":"解除失败!";
	}

	//修改优惠额度
	@Override
	public String Updatediscounts(int id) {
		return this.mDao.Updatediscounts(id)?"修改成功！":"修改失败！";
	}


}
