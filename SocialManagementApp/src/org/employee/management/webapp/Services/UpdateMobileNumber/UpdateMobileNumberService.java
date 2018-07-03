package org.employee.management.webapp.Services.UpdateMobileNumber;

import org.employee.management.webapp.DAO.UpdateMobileNumber.UpdateMobileNumberDao;
import org.employee.management.webapp.DTO.UpdateMobileNumber.UpdateMobileNumberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateMobileNumberService {
	
	@Autowired
	UpdateMobileNumberDao umnDao;
	
	public UpdateMobileNumberService() {

		System.out.println(this.getClass().getSimpleName()+" created");
	}
	
	public int updateMoblieNumService(UpdateMobileNumberDto umnDto){

		System.out.println("updateMoblieNumService method started..");
		
		
		
			
			int mobileAffectedCol = umnDao.updateMoblieNumDao(umnDto);

			System.out.println("updateMoblieNumService method ended");
			
			return mobileAffectedCol;
		
		
		
	}

}
