package com.service;

import java.util.List;
import java.util.Map;

import com.entity.Pager;
import com.entity.Warehouse;

public interface WareHouseService {
	//��ҳ��ѯ
	public Pager findbyPager(Pager pager);
	//���
	public void saveWareHouse(Warehouse warehouse);
	//ɾ��
	public void delWareHouse(Warehouse warehouse);
	//����id��ѯ����
	public List<Map> findbyid(Integer warehouseId);
	public Warehouse findbyid2(Integer warehouseId);
	//����
	public void upWareHouse(Warehouse warehouse);
	//��ѯmap����emp����
	public List<Map> findemp();
}
