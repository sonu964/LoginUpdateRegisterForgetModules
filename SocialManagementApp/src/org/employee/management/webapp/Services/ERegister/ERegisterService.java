package org.employee.management.webapp.Services.ERegister;

import org.employee.management.webapp.DAO.ERegister.ERegisterDao;
import org.employee.management.webapp.DTO.ERegister.ERegisterDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ERegisterService {
	
	@Autowired
	ERegisterDao erDao;
	
	public ERegisterService() {

		System.out.println(this.getClass().getSimpleName()+" created");
		
	}
	
	public void eRegisterService(ERegisterDto erdto){
		
		System.out.println("eRegisterService method started..");
		
		erDao.saveRagisterDao(erdto);
		
		System.out.println("eRegisterService method ended");
		
	}

}
