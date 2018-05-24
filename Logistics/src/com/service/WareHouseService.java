package com.service;

import java.util.List;
import java.util.Map;

import com.entity.Pager;
import com.entity.Warehouse;

public interface WareHouseService {
	//分页查询
	public Pager findbyPager(Pager pager);
	//添加
	public void saveWareHouse(Warehouse warehouse);
	//删除
	public void delWareHouse(Warehouse warehouse);
	//根据id查询单个
	public List<Map> findbyid(Integer warehouseId);
	public Warehouse findbyid2(Integer warehouseId);
	//更新
	public void upWareHouse(Warehouse warehouse);
	//查询map类型emp数据
	public List<Map> findemp();
}
