package com.util;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;

public class PageHibernateCallBack implements HibernateCallback<List> {
	private String hql;
	private Object[] params;
	private int curPage;
	private int pageSize;
	public PageHibernateCallBack(String hql, Object[] params, int curPage, int pageSize) {
		super();
		this.hql = hql;
		this.params = params;
		this.curPage = curPage;
		this.pageSize = pageSize;
	}
	@Override
	public List doInHibernate(Session session) throws HibernateException, SQLException {
		// TODO Auto-generated method stub
		Query query=session.createQuery(hql);
		if(params!=null){
			for (int i = 0; i < params.length; i++) {
				query.setParameter(i, params[i]);
			}
		}
		query.setFirstResult((curPage-1)*pageSize);
		query.setMaxResults(pageSize);
		return query.list();
	}

}
