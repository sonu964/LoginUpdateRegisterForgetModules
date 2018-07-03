package org.employee.management.webapp.DAO.EForgetPassword;

import org.employee.management.webapp.DTO.EForgetPassword.EForgetPasswordDto;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EForgetPasswordDao {
	
	@Autowired
	SessionFactory factory;
	public EForgetPasswordDao() {

		System.out.println(this.getClass().getSimpleName()+" created");
	}
	
	public int changePassword(EForgetPasswordDto efdto){
		
		System.out.println("changePassword method started..");
		
		Session session =factory.openSession();
		
		
		Transaction tx = null;
		Query query = null;
		
		int affectedRow = 0;
		
		try {
			
		//	String hql = "Update ERegisterDto ERD set ERD.ePassword = "+efdto.getNewPassword()+"  where ERD.eEmail = '"+efdto.geteEmail()+"' ";
			
			String hql = "Update ERegisterDto ERD set ePassword =:pwd where ERD.eEmail = :email ";
			query = session.createQuery(hql);
			
			query.setParameter("email",	efdto.geteEmail());
			query.setParameter("pwd", efdto.getNewPassword());
			
			tx = session.beginTransaction();
			
			 affectedRow = query.executeUpdate();
			 
			 tx.commit();
			
			
		} catch (HibernateException e) {

			tx.rollback();
		}
		
		System.out.println("changePassword method ended");
		return affectedRow;
	}

}
