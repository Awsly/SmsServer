package com.chinasofti.biz;
//vip业务类
public interface vipBiz {
	//4、办理会员卡业务
	public String Applyvip();
	//5、会员卡充值业务
	public String Recharge();
	//6、会员卡挂失业务
	public String Reportloss();
	//7、通过ID查询会员信息业务
	public  String vip(int id);
	//13、冻结会员卡业务
	public String Freezecard();
	//14、解除挂失业务
	public String Relieveloss();
	//15、修改优惠额度业务
	public String Updatediscounts();
}
