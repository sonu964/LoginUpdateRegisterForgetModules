package org.employee.management.webapp.DAO.ERegister;

import org.employee.management.webapp.DTO.ERegister.ERegisterDto;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ERegisterDao {
	
	@Autowired
	private SessionFactory factory;
	
	public ERegisterDao() {

		System.out.println(this.getClass().getSimpleName()+" created");
		
	}
	
	public void saveRagisterDao(ERegisterDto erdto){
		
		System.out.println("saveRagisterDao method started..");
		
		Session session = factory.openSession();
		Transaction tx = null;
		
		try{
			
			tx = session.beginTransaction();
			session.save(erdto);
			tx.commit();
			
		}catch (HibernateException e) {

			tx.rollback();
			
		}finally {
			
			session.close();
		}
		
		
		System.out.println("saveRagisterDao method ended");
		
	}

}
