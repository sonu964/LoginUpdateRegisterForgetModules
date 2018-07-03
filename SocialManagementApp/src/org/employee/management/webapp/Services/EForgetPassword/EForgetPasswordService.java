package org.employee.management.webapp.Services.EForgetPassword;

import org.employee.management.webapp.DAO.EForgetPassword.EForgetPasswordDao;
import org.employee.management.webapp.DTO.EForgetPassword.EForgetPasswordDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EForgetPasswordService {

	@Autowired
	EForgetPasswordDao erpDao;
	
	public EForgetPasswordService() {

		System.out.println(this.getClass().getSimpleName()+" created");
		
	}
	
	public int  forgetPasswordService(EForgetPasswordDto efdto){
		
		System.out.println("forgetPasswordService method started..");
		
		int affectedRow = erpDao.changePassword(efdto);
		
		
		System.out.println("forgetPasswordService method ended");
		
		return affectedRow;
		
	}
	
}
