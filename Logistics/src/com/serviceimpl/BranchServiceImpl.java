package com.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.BranchDao;
import com.entity.Branch;
import com.entity.Emp;
import com.entity.Pager;
import com.service.BranchService;
@Service
public class BranchServiceImpl implements BranchService {
	@Autowired
	private BranchDao dao;

	@Override
	public void saveBranch(Branch branch) {
		// TODO Auto-generated method stub
		dao.saveBranch(branch);
	}

	@Override
	public void delBranch(Branch branch) {
		// TODO Auto-generated method stub
		dao.delBranch(branch);
	}

	@Override
	public void updateBranch(Branch branch) {
		// TODO Auto-generated method stub
		dao.updateBranch(branch);
	}

	@Override
	public List<Branch> findBranchs() {
		// TODO Auto-generated method stub
		return dao.findBranchs();
	}

	@Override
	public Branch getBranch(Integer branchId) {
		// TODO Auto-generated method stub
		return dao.getBranch(branchId);
	}

	@Override
	public List<Emp> findeEmps() {
		// TODO Auto-generated method stub
		return dao.findeEmps();
	}

	@Override
	public List<Map> findBranchs2() {
		// TODO Auto-generated method stub
		return dao.findBranchs2();
	}

	@Override
	public Pager findbyPager(Pager pager) {
		// TODO Auto-generated method stub
		return dao.findbyPager(pager);
	}

}
