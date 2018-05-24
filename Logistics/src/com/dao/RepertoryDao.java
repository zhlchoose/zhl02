package com.dao;

import java.util.List;

import com.entity.Pager;
import com.entity.Repertory;

public interface RepertoryDao {
	//库存分页查询
	public Pager findbyPager(Pager pager);
	//查询所有库存
	public List<Repertory> findRepertories();
	//分页查询在库的库存
	public Pager findbyPager2(Pager pager);
	//查询在库的库存
	public List<Repertory> findRepertories2();
	//查询已出库的库存
	public List<Repertory> findRepertories3();
	//分页查询已出库的库存
	public Pager findbyPager3(Pager pager);
	//根据id查询库存
	public Repertory getRepertory(Integer repertoryId);
	//更新库存
	public void updateRepertory(Repertory repertory);
}
