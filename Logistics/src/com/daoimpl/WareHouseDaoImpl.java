package com.daoimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.dao.WareHouseDao;
import com.entity.Pager;
import com.entity.Warehouse;
import com.util.*;

@Repository
public class WareHouseDaoImpl implements WareHouseDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Override
	public Pager findbyPager(Pager pager) {
		String hql="select new Map(w.warehouseId as Id,w.warehouseName as warehouseName,w.branch.branchName as branchName,w.warehouseAdress as warehouseAdress,w.warehouseArea as warehouseArea,w.emp.empName as empName) from Warehouse as w";
		String hql1="select count(*) from Warehouse";
		Pager p=(Pager) this.hibernateTemplate.execute(new PagerHelper(hql, hql1, null, pager.getCurPage(), pager.getPageSize()));
		return p;
	}

	@Override
	public void saveWareHouse(Warehouse warehouse) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.save(warehouse);
	}

	@Override
	public void delWareHouse(Warehouse warehouse) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.delete(warehouse);
	}

	@Override
	public List<Map> findbyid(Integer warehouseId) {
		// TODO Auto-generated method stub
		String hql="select new Map(w.warehouseId as warehouseId,w.warehouseName as warehouseName,w.branch.branchId as branchId,w.emp.empId as empId,w.warehouseAdress as warehouseAdress,w.warehouseArea as warehouseArea,w.rent as rent) from Warehouse w where w.warehouseId='"+warehouseId+"'";
		return (List<Map>)this.hibernateTemplate.find(hql);
	}

	@Override
	public Warehouse findbyid2(Integer warehouseId) {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.get(Warehouse.class, warehouseId);
	}

	@Override
	public void upWareHouse(Warehouse warehouse) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.update(warehouse);
	}

	@Override
	public List<Map> findemp() {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("select new Map(empId as empId,empName as empName) from Emp");
	}

}
