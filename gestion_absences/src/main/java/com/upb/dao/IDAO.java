package com.upb.dao;

import java.util.List;


public interface IDAO {
	
	/**
	 * Add Object
	 * 
	 * @param  Object Object
	 */
	public void addObject(Object object);
	
	/**
	 * Delete Object
	 * 
	 * @param  Object Object
	 */
	public void deleteObject(Object object);
	
	/**
	 * Get Object
	 * 
	 * @param  int Object Id
	 */
	public Object getObjectById(int id, String objet);
	
	public Object getObjectById(String id, String objet);
	/**
	 * Get Object List
	 * 
	 */
	public List<Object> getObjects(Object object);
	
	/**
	 * Get Object List
	 */
	public  List getObjects(String objet);
	
	/**
	 * Update Object
	 * 
	 * @param  Object Object
	 */
	public void updateObject(Object object);

}
