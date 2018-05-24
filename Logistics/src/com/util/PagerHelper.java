package com.util;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;

import com.entity.Pager;



public class PagerHelper<T> implements HibernateCallback<Pager> {
	
	//Ҫִ�е�����
	private String hql;
	//��ȡ������
	private String hql1;
	//��������
	private Object[] params;
	//��ǰҳ
	private int curPage;
	//ÿҳ����
	private int pageSize;
	
	
	public PagerHelper(String hql,String hql1, Object[] params, int curPage, int pageSize) {
		super();
		this.hql = hql;
		this.hql1=hql1;
		this.params = params;
		this.curPage = curPage;
		this.pageSize = pageSize;
	}

	@Override
	public Pager doInHibernate(Session session) throws HibernateException, SQLException {
		//��ҳ
		Query query=session.createQuery(hql);
		if(params!=null){
			for (int i = 0; i < params.length; i++) {
				query.setParameter(i, params[i]);//��Ӳ���
			}
		}
		query.setFirstResult((curPage-1)*pageSize);
		query.setMaxResults(pageSize);
		//�õ���ҳ����
		Pager p=new Pager();
		p.setCurPage(curPage);
		p.setPageSize(pageSize);
		p.setList(query.list());
		//�ٴβ�ѯ�õ�����������������
		query= session.createQuery(hql1);
		p.setTotalCount(Integer.parseInt(query.uniqueResult().toString()));
		return p;
	}
	
	

}
