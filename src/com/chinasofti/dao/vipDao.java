package com.chinasofti.dao;

import java.util.List;

import com.chinasofti.domain.vip;

public interface vipDao {
	//办理会员卡的方法
	public boolean Applyvip(vip v);
	//会员卡充值的方法
	public boolean Recharge();
	//会员卡挂失的方法
	public boolean Reportloss(int id);
	//通过id查询会员的方法
	public List<vip> vip(int id);
}
