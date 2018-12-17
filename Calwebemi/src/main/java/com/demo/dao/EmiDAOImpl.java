package com.demo.dao;

import java.util.List;

import javax.management.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import com.demo.entity.Emi;

@Repository
public class EmiDAOImpl implements EmiDAO{
	
	// inject 
		@Autowired
		private SessionFactory sessionFactory;

		@Override
		public void  saveEmi(Emi emi ) {
			Session currentSession = sessionFactory.getCurrentSession();
			currentSession.save(emi);
			
			
			}
	

	

		

	}
