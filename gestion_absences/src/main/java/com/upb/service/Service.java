package com.upb.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.upb.dao.IDAO;

@Transactional(readOnly = true)
public class Service implements Iservice {

	// DAO is injected...
		IDAO DAO;
		
		@Transactional(readOnly = false)
		@Override
		public void addObject(Object object) {
			// TODO Auto-generated method stub
			getDAO().addObject(object);
		}
		
		
		@Transactional(readOnly = false)
		@Override
		public void deleteObject(Object object) {
			// TODO Auto-generated method stub
			getDAO().deleteObject(object);
		}
		
		public IDAO getDAO() {
			return DAO;
		}

		@Override
		public Object getObjectById(int id, String objet) {
			// TODO Auto-generated method stub
			return getDAO().getObjectById(id, objet);
		}

		@Override
		public Object getObjectById(String id, String objet) {
			// TODO Auto-generated method stub
			return getDAO().getObjectById(id, objet);
		}

		@Override
		public List<Object> getObjects(Object object) {
			// TODO Auto-generated method stub
			return null;
		}

		
		
		@Override
		public List getObjects(String objet) {
			// TODO Auto-generated method stub
			return getDAO().getObjects(objet);
		}

		public void setDAO(IDAO dAO) {
			DAO = dAO;
		}


		@Transactional(readOnly = false)
		@Override
		public void updateObject(Object object) {
			// TODO Auto-generated method stub
			getDAO().updateObject(object);
		}

}
