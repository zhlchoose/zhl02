package com.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.dao.RepertoryDao;
import com.entity.Pager;
import com.entity.Repertory;
import com.util.PagerHelper;
@Repository
public class RepertoryDaoImpl implements RepertoryDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Override
	public List<Repertory> findRepertories() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Repertory");
	}
	@Override
	public Repertory getRepertory(Integer repertoryId) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Repertory.class, repertoryId);
	}
	@Override
	public void updateRepertory(Repertory repertory) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(repertory);
	}
	@Override
	public List<Repertory> findRepertories2() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Repertory where repertoryState='已入库'");
	}
	@Override
	public List<Repertory> findRepertories3() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Repertory where repertoryState='已出库'");
	}
	@Override
	public Pager findbyPager(Pager pager) {
		// TODO Auto-generated method stub
		String hql="from Repertory";
		String hql1="select count(*) from Repertory";
		Pager p=this.hibernateTemplate.execute(new PagerHelper(hql, hql1, null, pager.getCurPage(), pager.getPageSize()));
		return p;
	}
	@Override
	public Pager findbyPager2(Pager pager) {
		// TODO Auto-generated method stub
		String hql="from Repertory where repertoryState='已入库'";
		String hql1="select count(*) from Repertory where repertoryState='已入库'";
		Pager p=this.hibernateTemplate.execute(new PagerHelper(hql, hql1, null, pager.getCurPage(), pager.getPageSize()));
		return p;
	}
	@Override
	public Pager findbyPager3(Pager pager) {
		// TODO Auto-generated method stub
		String hql="from Repertory where repertoryState='已出库'";
		String hql1="select count(*) from Repertory where repertoryState='已出库'";
		Pager p=this.hibernateTemplate.execute(new PagerHelper(hql, hql1, null, pager.getCurPage(), pager.getPageSize()));
		return p;
	}

}
