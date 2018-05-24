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

	//��ѯ��������
	public String findBranch(){
		List<Branch> branchs=service.findBranchs();
		getRequest().put("branch", branchs);
		return "findBranch";
	}
	//��ҳ��ѯ����
	public String findbyPager(){
		pager.setPageSize(3);
		Pager p=service.findbyPager(pager);
		getRequest().put("p", p);
		return "findbyPager";
	}
	//�������֮ǰ��ѯempԱ����Ϣ
	public String findemp(){
		List<Emp> emps=service.findeEmps();
		getRequest().put("emps", emps);
		return "findemp";
	}
	//�������
	public String saveBranch(){
		service.saveBranch(branch);
		return "saveBranch";
	}
	//ɾ������
	public String delBranch(){
		service.delBranch(branch);
		return "delBranch";
	}
	//����id��ѯ����
	public String getBranchs(){
		Branch b1=service.getBranch(branch.getBranchId());
		getRequest().put("branch", b1);
		return "getBranchs";
	}
	//����ǰ��ѯ
	public String afterupdate(){
		Branch b1=service.getBranch(branch.getBranchId());
		List<Emp> emps=service.findeEmps();
		System.out.println(emps.get(0).getEmpName());
		getRequest().put("b1", b1);
		getRequest().put("emps", emps);
		return "afterupdate";
	}
	//����������Ϣ
	public String Update(){
		service.updateBranch(branch);
		
		return "Update";
	}
	public String updatebr(){
		service.updateBranch(branch);
		return SUCCESS;
	}
}
