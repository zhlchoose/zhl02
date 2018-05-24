package com.action.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.entity.Branch;
import com.entity.Emp;
import com.entity.Pager;
import com.service.BranchService;

public class BranchAction extends BaseAction {
	@Autowired
	private BranchService service;
	private Branch branch;
	private Pager pager;
	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	
	public Pager getPager() {
		return pager;
	}

	public void setPager(Pager pager) {
		this.pager = pager;
	}

	//查询所有网点
	public String findBranch(){
		List<Branch> branchs=service.findBranchs();
		getRequest().put("branch", branchs);
		return "findBranch";
	}
	//分页查询网点
	public String findbyPager(){
		pager.setPageSize(3);
		Pager p=service.findbyPager(pager);
		getRequest().put("p", p);
		return "findbyPager";
	}
	//添加网点之前查询emp员工信息
	public String findemp(){
		List<Emp> emps=service.findeEmps();
		getRequest().put("emps", emps);
		return "findemp";
	}
	//添加网点
	public String saveBranch(){
		service.saveBranch(branch);
		return "saveBranch";
	}
	//删除网点
	public String delBranch(){
		service.delBranch(branch);
		return "delBranch";
	}
	//根据id查询网点
	public String getBranchs(){
		Branch b1=service.getBranch(branch.getBranchId());
		getRequest().put("branch", b1);
		return "getBranchs";
	}
	//更新前查询
	public String afterupdate(){
		Branch b1=service.getBranch(branch.getBranchId());
		List<Emp> emps=service.findeEmps();
		System.out.println(emps.get(0).getEmpName());
		getRequest().put("b1", b1);
		getRequest().put("emps", emps);
		return "afterupdate";
	}
	//更新网点信息
	public String Update(){
		service.updateBranch(branch);
		
		return "Update";
	}
	public String updatebr(){
		service.updateBranch(branch);
		return SUCCESS;
	}
}
