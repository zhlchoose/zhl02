package com.service;

import java.util.List;
import java.util.Map;

import com.entity.Branch;
import com.entity.Emp;
import com.entity.Pager;

public interface BranchService {
	//�������
	public void saveBranch(Branch branch);
	//��ҳ��ѯ����
	public Pager findbyPager(Pager pager);
	//ɾ������
	public void delBranch(Branch branch);
	//��������
	public void updateBranch(Branch branch);
	//��ѯ����
	public List<Branch> findBranchs();
	//����id��ѯ����
	public Branch getBranch(Integer branchId);
	//��ѯԱ����Ϣ
	public List<Emp> findeEmps();
	//��ѯMap����
	public List<Map> findBranchs2();
}
