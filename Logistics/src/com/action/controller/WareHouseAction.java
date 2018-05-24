package com.action.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.entity.Branch;
import com.entity.Emp;
import com.entity.Message;
import com.entity.Pager;
import com.entity.Warehouse;
import com.service.BranchService;
import com.service.WareHouseService;
import com.serviceimpl.BranchServiceImpl;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;



@Controller
public class WareHouseAction extends BaseAction {
	@Autowired
	private WareHouseService service;
	@Autowired
	private BranchService bs;
	private Warehouse warehouse;
	private Pager pager;
	public Pager getPager() {
		return pager;
	}

	public void setPager(Pager pager) {
		this.pager = pager;
	}

	public Warehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

/*	public void test1(){
		//System.out.println(11);
		Pager p1=new Pager();
		p1.setCurPage(1);
		p1.setPageSize(1);
		Pager p=service.findbyPager(p1);
		//System.out.println(p);
		String msg1=null;
		msg1=JSONObject.fromObject(p).toString();
		//msg1=JSONObject.toJSONString(p);
		System.out.println(msg1);
		System.out.println(11);
		this.getPrintWriter().print(msg1);
	}*/
	public String test2(){
		pager.setPageSize(3);
		//System.out.println(pager.getCurPage());
		Pager p=service.findbyPager(pager);
		String str=JSONObject.fromObject(p).toString();
		this.getPrintWriter().print(str);
		return null;
	}
	public String delWarehouse(){
		//System.out.println("yes！");
		System.out.println(warehouse.getWarehouseId());
		service.delWareHouse(warehouse);
		//System.out.println(1);
		Message message=new Message();
		message.setMessage("删除成功！");
		String str=JSONObject.fromObject(message).toString();
		System.out.println(str);
		this.getPrintWriter().print(str);
		return null;
	}
	public void beforeSave(){
		List<Map> branchs=bs.findBranchs2();	
		List<Map> emps=service.findemp();
		List list=new ArrayList();
		list.add(branchs);
		list.add(emps);
		this.getPrintWriter().print(JSONArray.fromObject(list));
	}
	public void beforeSave2(){
		List<Map> emps=service.findemp();
		this.getPrintWriter().print(JSONArray.fromObject(emps));
	}
	public void saveWarehouse(){
		service.saveWareHouse(warehouse);
		Message message=new Message();
		message.setMessage("添加成功");
		this.getPrintWriter().print(JSONObject.fromObject(message));
	}
	public void findbyid(){
		System.out.println(warehouse.getWarehouseId());
		List<Map> list=service.findbyid(warehouse.getWarehouseId());
		this.getPrintWriter().print(JSONArray.fromObject(list));
	}
	public void upWarehouse(){
		service.upWareHouse(warehouse);
		Message message=new Message();
		message.setMessage("修改成功！");
		this.getPrintWriter().print(JSONObject.fromObject(message));
	}
	
}
