package com.daoimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.dao.BranchDao;
import com.entity.Branch;
import com.entity.Emp;
import com.entity.Pager;
import com.util.PagerHelper;
@Repository
public class BranchDaoImpl implements BranchDao{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void saveBranch(Branch branch) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(branch);
	}

	@Override
	public void delBranch(Branch branch) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(branch);
	}

	@Override
	public void updateBranch(Branch branch) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(branch);
	}

	@Override
	public List<Branch> findBranchs() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Branch");
	}

	@Override
	public Branch getBranch(Integer branchId) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Branch.class, branchId);
	}

	@Override
	public List<Emp> findeEmps() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Emp");
	}

	@Override
	public List<Map> findBranchs2() {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("select new Map(branchId as branchId,branchName as branchName)from Branch");
	}

	@Override
	public Pager findbyPager(Pager pager) {
		// TODO Auto-generated method stub
		String hql="from Branch";
		String hql2="select count(*) from Branch";
		Pager p=this.hibernateTemplate.execute(new PagerHelper(hql, hql2, null, pager.getCurPage(), pager.getPageSize()));
		return p;
	}
	
}
