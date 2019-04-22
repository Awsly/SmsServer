package com.chinasofti.biz;

import java.util.List;

import com.chinasofti.domain.kind;
import com.chinasofti.domain.menu;

//菜单业务类
public interface menuBiz {
	//5、添加菜品业务
	public String Addgreens(int mmid, String mmname, double price, int kid);
	//6、查询菜品业务
	public List<menu> Selectgreens();
	//7、修改菜品业务
	public String Updategreens(int id);
	//8、删除菜品业务
	public String Deletegreens(int id);
	//9、增加菜类业务
	public String Addvegetables(int kid,String kname);
	//10、查询菜类业务
	public List<kind> Selectvegetables();
	//11、修改菜类业务
	public String Updatevegetables(int id);
	//12、删除菜类业务
	public String Deletevegetables(int id);
}
