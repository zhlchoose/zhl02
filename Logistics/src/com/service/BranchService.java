package com.service;

import java.util.List;
import java.util.Map;

import com.entity.Branch;
import com.entity.Emp;
import com.entity.Pager;

public interface BranchService {
	//添加网点
	public void saveBranch(Branch branch);
	//分页查询网点
	public Pager findbyPager(Pager pager);
	//删除网点
	public void delBranch(Branch branch);
	//更新网点
	public void updateBranch(Branch branch);
	//查询网点
	public List<Branch> findBranchs();
	//根据id查询网点
	public Branch getBranch(Integer branchId);
	//查询员工信息
	public List<Emp> findeEmps();
	//查询Map网点
	public List<Map> findBranchs2();
}
