package org.employee.management.webapp.DAO.ELogin;

import org.employee.management.webapp.DTO.ELogin.ELoginDto;
import org.employee.management.webapp.DTO.ERegister.ERegisterDto;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

@Repository
public class ELoginDao {
	
	@Autowired
	SessionFactory factory;
	
	public ELoginDao() {
		
		System.out.println(this.getClass().getSimpleName()+" created");
	}
	
	public ERegisterDto empFatch(ELoginDto eldto){
		
		System.out.println("empFatch method started..");
		
		Query query = null;
		ERegisterDto erdtoFromDB = null;
		
		
		Session session = factory.openSession();
		
		try {
			
			String hql = " From ERegisterDto E where E.eId=:id and E.ePassword=:pd ";
			
			
			query = session.createQuery(hql);
			
			query.setParameter("id", eldto.geteId());
			query.setParameter("pd", eldto.getePassword());
			
			 erdtoFromDB =(ERegisterDto)query.uniqueResult();
			
			
		} catch (HibernateException e) {

			e.printStackTrace();
		}
		
		System.out.println("empFatch method ended");
		
		return erdtoFromDB;
	}

}
