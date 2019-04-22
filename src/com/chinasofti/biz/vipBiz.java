package com.chinasofti.biz;

import java.util.List;

import com.chinasofti.domain.vip;

//vip业务类
public interface vipBiz {
	//4、办理会员卡业务
	public String Applyvip(int vid, String vname, String vsex, double money, String vlevel);
	//5、会员卡充值业务
	public String Recharge(double money);
	//6、会员卡挂失业务
	public String Reportloss(int id);
	//7、通过ID查询会员信息业务
	public  List<vip> selectvip(int id);
	//13、冻结会员卡业务
	public String Freezecard(int id);
	//14、解除挂失业务
	public String Relieveloss(int id);
	//15、修改优惠额度业务
	public String Updatediscounts(int id);
}
