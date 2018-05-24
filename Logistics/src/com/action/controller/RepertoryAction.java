package com.action.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.entity.Pager;
import com.entity.Repertory;
import com.service.RepertoryService;

@Controller
public class RepertoryAction extends BaseAction {
	@Autowired
	private RepertoryService service;
	private Pager pager;
	public Pager getPager() {
		return pager;
	}
	public void setPager(Pager pager) {
		this.pager = pager;
	}
	private Repertory repertory;
	public Repertory getRepertory() {
		return repertory;
	}
	public void setRepertory(Repertory repertory) {
		this.repertory = repertory;
	}
	//查询所有库存
	public String findRepertory(){
		List<Repertory> repertories=service.findRepertories();
		getRequest().put("repertories", repertories);
		return "findRepertory";
	}
	//库存分页查询
	public String findbyPager(){
		pager.setPageSize(1);
		Pager p=service.findbyPager(pager);
		getRequest().put("p", p);
		return "findbyPager";
	}
	//分页查询在库库存
	public String findbyPager2(){
		pager.setPageSize(1);
		Pager p=service.findbyPager2(pager);
		getRequest().put("p", p);
		return "findbyPager2";
	}
/*	//查询在库库存
	public String findRepertory2(){
		List<Repertory> repertories=service.findRepertories2();
		getRequest().put("repertories", repertories);
		return "findRepertory2";
	}*/
	//分页查询已出库的库存
	public String findbyPager3(){
		pager.setPageSize(1);
		Pager p=service.findbyPager3(pager);
		getRequest().put("p", p);
		return "findbyPager3";
	}
/*	//查询出库库存
	public String findRepertory3(){
		List<Repertory> repertories=service.findRepertories3();
		getRequest().put("repertories", repertories);
		return "findRepertory3";
	}*/
	//更新库存状态
	public String updateRepertory(){
		System.out.println(repertory.getRepertoryId());
		Repertory re=service.getRepertory(repertory.getRepertoryId());
		re.setRepertoryState("已出库");
		service.updateRepertory(re);
		return "updateRepertory";
	}
	public String updateRepertory2(){
		System.out.println(repertory.getRepertoryId());
		Repertory re=service.getRepertory(repertory.getRepertoryId());
		re.setRepertoryState("已出库");
		service.updateRepertory(re);
		return "updateRepertory2";
	}
	public String updateRepertory3(){
		System.out.println(repertory.getRepertoryId());
		Repertory re=service.getRepertory(repertory.getRepertoryId());
		re.setRepertoryState("已出库");
		service.updateRepertory(re);
		return "updateRepertory3";
	}
}
