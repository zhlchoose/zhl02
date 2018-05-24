package com.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.RepertoryDao;
import com.entity.Pager;
import com.entity.Repertory;
import com.service.RepertoryService;
@Service
public class RepertoryServiceImpl implements RepertoryService {
	@Autowired
	private RepertoryDao dao;
	public RepertoryDao getDao() {
		return dao;
	}
	public void setDao(RepertoryDao dao) {
		this.dao = dao;
	}
	//查询所有库存
	@Override
	public List<Repertory> findRepertories() {
		// TODO Auto-generated method stub
		return dao.findRepertories();
	}
	//根据id查询库存
	@Override
	public Repertory getRepertory(Integer repertoryId) {
		// TODO Auto-generated method stub
		return dao.getRepertory(repertoryId);
	}
	//更新库存
	@Override
	public void updateRepertory(Repertory repertory) {
		// TODO Auto-generated method stub
		dao.updateRepertory(repertory);
	}
	@Override
	public List<Repertory> findRepertories2() {
		// TODO Auto-generated method stub
		return dao.findRepertories2();
	}
	@Override
	public List<Repertory> findRepertories3() {
		// TODO Auto-generated method stub
		return dao.findRepertories3();
	}
	@Override
	public Pager findbyPager(Pager pager) {
		// TODO Auto-generated method stub
		return dao.findbyPager(pager);
	}
	@Override
	public Pager findbyPager3(Pager pager) {
		// TODO Auto-generated method stub
		return dao.findbyPager3(pager);
	}
	@Override
	public Pager findbyPager2(Pager pager) {
		// TODO Auto-generated method stub
		return dao.findbyPager2(pager);
	}

}
