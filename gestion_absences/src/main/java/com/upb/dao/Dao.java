package com.upb.dao;

import java.util.List;

import org.hibernate.SessionFactory;

public class Dao implements IDAO {

	private SessionFactory sessionFactory;

	@Override
	public void addObject(Object object) {
		// TODO Auto-generated method stub
		getSessionFactory().getCurrentSession().save(object);

	}

	@Override
	public void deleteObject(Object Object) {
		// TODO Auto-generated method stub
		getSessionFactory().getCurrentSession().delete(Object);
	}

	@Override
	public Object getObjectById(int id, String objet) {
		// TODO Auto-generated method stub
		String query= "from" +" "+ objet + " "+ " where id =?";
		  List liste = getSessionFactory().getCurrentSession().createQuery(query).setParameter(0,id).list();
		  if (liste.size()==0){
		   return null;}
		return liste.get(0);
	}

	@Override
	public Object getObjectById(String id, String objet) {
	// TODO Auto-generated method stub
	String query= "from" +" "+ objet + " "+ " where id =?";
	  List liste = getSessionFactory().getCurrentSession().createQuery(query).setParameter(0,id).list();
	  System.out.println("===========Taille liste requete"+liste.size());
	  if (liste.size()==0){
	   return null;}
	return liste.get(0);
}
	
	
/*	public Object getObjectById(String id, String objet) {
		// TODO Auto-generated method stub
		String query= "from" +" "+ objet + " "+ " where id =?";
		  List liste = getSessionFactory().getCurrentSession().createQuery(query).setParameter(0,id).list();
		  if (liste.size()==0){
		   return null;}
		return liste.get(0);
	}*/
	
	

	@Override
	public List<Object> getObjects(Object object) {
		// TODO Auto-generated method stub
		List list = getSessionFactory().getCurrentSession().createQuery("from"+" "+object).list();
			// TODO Auto-generated method stub
			return list ;
	}

	@Override
	public List getObjects(String objet) {
		// TODO Auto-generated method stub
		String query = "from"+" "+objet;
		List list = getSessionFactory().getCurrentSession().createQuery(query).list();
		return list;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void updateObject(Object object) {
		// TODO Auto-generated method stub
		getSessionFactory().getCurrentSession().update(object);
	}

	
}
