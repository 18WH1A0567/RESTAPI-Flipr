package com.db;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class HibernateTemplate {
	
	private static SessionFactory sessionFactory;
	
	static{
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}
	
	public static int addObject(Object obj){		
		//System.out.println("Inside Template(add object)");
		
		int result=0;
		Transaction tx = null;
		
		try{			
			Session session=sessionFactory.openSession();
			tx=session.beginTransaction();
			System.out.println(obj);
			
			session.save(obj);
			
			tx.commit();			
			result=1;
			
		}catch (Exception e){		
			if (tx != null) {
			    tx.rollback();
			}			
			e.printStackTrace();
		}
		
		return result;
	}
	
	public static List<Object> getObjectListByName(Class c, String columName, String value) {
		
		Session session=sessionFactory.openSession();
	    Criteria criteria = session.createCriteria(c);
	    Criterion nameCriterion = Restrictions.eq(columName, value);
	    criteria.add(nameCriterion);
	    return criteria.list();
	}
	
	public static List<Object> getObjectListByQuery(String query){
		
		return sessionFactory.openSession().createQuery(query).list();
	}
	
	
	
	public static int updateObject(Object obj){
		int result=0;		
		Transaction tx=null;
		
		try {
			
			Session session=sessionFactory.openSession();
			tx=session.beginTransaction();
			
			session.saveOrUpdate(obj);			
			tx.commit();
			
			result=1;
			
		} catch (Exception e) {
		
			tx.rollback();			
			e.printStackTrace();
		}		
		return result;
	}
	
	public static Object getObject(Class c,Serializable serializable){
		Object obj=null;
		
		try {			
			return sessionFactory.openSession().get(c,serializable);
			
		} catch (Exception e) {			
			e.printStackTrace();
		}		
		sessionFactory.close();
		return obj;
	}
	

}
