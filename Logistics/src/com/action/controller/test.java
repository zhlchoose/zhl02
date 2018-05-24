package com.action.controller;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;

import com.dao.WareHouseDao;
import com.daoimpl.WareHouseDaoImpl;
import com.util.HibernateSessionFactory;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=HibernateSessionFactory.getSession();
		Query query=session.createQuery("select new Map(w.warehouseId as warehouseId,w.branch.branchId as branchId,w.emp.empId as empId,w.warehouseAdress as warehouseAdress,w.warehouseArea as warehouseArea,w.rent as rent) from Warehouse as w where warehouseId=21");
		List<Map> list=query.list();
	}

}
