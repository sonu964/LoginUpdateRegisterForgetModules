package org.employee.management.webapp.Services.ELogin;

import org.employee.management.webapp.DAO.ELogin.ELoginDao;
import org.employee.management.webapp.DTO.ELogin.ELoginDto;
import org.employee.management.webapp.DTO.ERegister.ERegisterDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ELoginService {
	
	@Autowired
	ELoginDao eldao;
	
	
	public ELoginService() {
		
		System.out.println(this.getClass().getSimpleName()+" created");
		
	}
	
	public ERegisterDto empLoginService(ELoginDto eldto){
		
		System.out.println("empLoginService method started..");
		
		ERegisterDto erdtoFromDB = eldao.empFatch(eldto);
		
		System.out.println("empLoginService method ended");
		
		return erdtoFromDB;

		
	}

}
