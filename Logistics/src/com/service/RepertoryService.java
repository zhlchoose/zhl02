package com.service;

import java.util.List;

import com.entity.Pager;
import com.entity.Repertory;

public interface RepertoryService {
	//����ҳ��ѯ
	public Pager findbyPager(Pager pager);
	//��ѯ���п��
	public List<Repertory> findRepertories();
	//����id��ѯ���
	public Repertory getRepertory(Integer repertoryId);
	//���¿��
	public void updateRepertory(Repertory repertory);
	//��ѯ�ڿ�Ŀ��
	public List<Repertory> findRepertories2();
	//��ѯ�ѳ���Ŀ��
	public List<Repertory> findRepertories3();
	//��ҳ��ѯ�ѳ���Ŀ��
	public Pager findbyPager3(Pager pager);	
	//��ҳ��ѯ�ڿ�Ŀ��
	public Pager findbyPager2(Pager pager);
}
