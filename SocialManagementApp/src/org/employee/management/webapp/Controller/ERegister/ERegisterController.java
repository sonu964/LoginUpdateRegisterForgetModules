package org.employee.management.webapp.Controller.ERegister;

import org.employee.management.webapp.DTO.ERegister.ERegisterDto;
import org.employee.management.webapp.Services.ERegister.ERegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/")
@Controller
public class ERegisterController {
	
	@Autowired
	ERegisterService erService;
	
	public ERegisterController() {

		System.out.println(this.getClass().getSimpleName()+" created");
		
	}
	
	@RequestMapping(value="eregister.do", method=RequestMethod.POST)
	public ModelAndView eRegisterController(ERegisterDto erdto){
		
		System.out.println("eRegisterController method started..");
		
		erService.eRegisterService(erdto);
		
		System.out.println("eRegisterController method ended");
		
		return new ModelAndView("/ELogin.jsp","msg","Registation successfully");
	}

}
