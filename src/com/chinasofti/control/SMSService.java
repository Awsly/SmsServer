package com.chinasofti.control;

import java.util.List;

import com.chinasofti.domain.employee;
import com.chinasofti.domain.kind;
import com.chinasofti.domain.menu;
import com.chinasofti.domain.shopcar;
import com.chinasofti.domain.statistics;
import com.chinasofti.domain.vip;


public interface SMSService {

	//1、点菜进购物车业务
	public String Addshopcar(int id);
	//2、删除购物车菜品业务
	public String Deleteshopcar(int id);
	//3、查询购物车菜品业务
	public List<shopcar> Selectshopcar();
	//4、添加员工业务
	public String addemployee(int eid, String ename, String esex, int age, String address);
	//5、查询所有员工业务
	public List<employee> Selectemployee();
	//6、查询所有员工业务
	public List<employee> Selectemployee(int id);
	//7、修改员工业务
	public String Updateemployee(int id);
	//8、删除员工业务
	public String Deleteemployee(int id);
	//9、统计信息业务
	public List<statistics> Statistics();
	//10、通过ID查询会员信息业务
	public List<vip> Selectvip(int id);
	//11、添加菜品业务
	public String Addgreens(int mmid, String mmname, double price, int kid);
	//12、查询菜品业务
	public List<menu> Selectgreens();
	//13、修改菜品业务
	public String Updategreens(int id);
	//14、删除菜品业务
	public String Deletegreens(int id);
	//15、增加菜类业务
	public String Addvegetables(int kid,String kname);
	//16、查询菜类业务
	public List<kind> Selectvegetables();
	//17、修改菜类业务
	public String Updatevegetables(int id);
	//18、删除菜类业务
	public String Deletevegetables(int id);
	//19、办理会员卡业务
	public String Applyvip(int vid, String vname, String vsex, double money, String vlevel);
	//20、会员卡充值业务
	public String Recharge(double money);
	//21、会员卡挂失业务
	public String Reportloss(int id);
	//22、通过ID查询会员信息业务
	public  List<vip> selectvip(int id);
	//23、冻结会员卡业务
	public String Freezecard(int id);
	//24、解除挂失业务
	public String Relieveloss(int id);
	//25、修改优惠额度业务
	public String Updatediscounts(int id);
}
