package com.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.WareHouseDao;
import com.entity.Pager;
import com.entity.Warehouse;
import com.service.WareHouseService;
@Service
public class WareHouseServiceImpl implements WareHouseService {
	@Autowired
	private WareHouseDao dao;


	@Override
	public Pager findbyPager(Pager pager) {
		// TODO Auto-generated method stub
		return dao.findbyPager(pager);
	}

	@Override
	public void saveWareHouse(Warehouse warehouse) {
		// TODO Auto-generated method stub
		dao.saveWareHouse(warehouse);
	}

	@Override
	public void delWareHouse(Warehouse warehouse) {
		// TODO Auto-generated method stub
		dao.delWareHouse(warehouse);
	}

	@Override
	public List<Map> findbyid(Integer warehouseId) {
		// TODO Auto-generated method stub
		return dao.findbyid(warehouseId);
	}

	@Override
	public void upWareHouse(Warehouse warehouse) {
		// TODO Auto-generated method stub
		dao.upWareHouse(warehouse);
	}

	@Override
	public Warehouse findbyid2(Integer warehouseId) {
		// TODO Auto-generated method stub
		return dao.findbyid2(warehouseId);
	}

	@Override
	public List<Map> findemp() {
		// TODO Auto-generated method stub
		return dao.findemp();
	}

}
