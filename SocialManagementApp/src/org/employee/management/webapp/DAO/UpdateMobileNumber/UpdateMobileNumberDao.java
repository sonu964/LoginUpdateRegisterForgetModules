package org.employee.management.webapp.DAO.UpdateMobileNumber;


import org.employee.management.webapp.DTO.UpdateMobileNumber.UpdateMobileNumberDto;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;;

@Repository
public class UpdateMobileNumberDao {

	@Autowired
	SessionFactory factory;

	public UpdateMobileNumberDao() {

		System.out.println(this.getClass().getSimpleName()+" created");
	}

	public int updateMoblieNumDao(UpdateMobileNumberDto umnDto){

		System.out.println("updateMoblieNumDao method started..");


		

			Session session = factory.openSession();
			Transaction tx = null;
			Query query = null;

			int mobileAffectedCol = 0;

			try {

				String hql = " Update ERegisterDto set eMobile=:mob where eEmail=:email ";

				query = session.createQuery(hql);

				query.setParameter("mob", umnDto.geteMobile());
				query.setParameter("email", umnDto.geteEmail());

				tx = session.beginTransaction();

				mobileAffectedCol = query.executeUpdate();

				tx.commit();


			} catch (HibernateException e) {

				tx.rollback();
			}

			System.out.println("updateMoblieNumDao method ended");

			return mobileAffectedCol;
		}
}

