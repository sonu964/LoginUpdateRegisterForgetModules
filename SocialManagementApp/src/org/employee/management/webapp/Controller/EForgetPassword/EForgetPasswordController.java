package org.employee.management.webapp.Controller.EForgetPassword;

import org.employee.management.webapp.DTO.EForgetPassword.EForgetPasswordDto;
import org.employee.management.webapp.Services.EForgetPassword.EForgetPasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/")
@Controller
public class EForgetPasswordController {

	@Autowired
	EForgetPasswordService efpService;
	
	public EForgetPasswordController() {

		System.out.println(this.getClass().getSimpleName()+" created");
	}

	@RequestMapping(value="eloginforgetpassword.do",method=RequestMethod.POST)
	public ModelAndView forgetPasswordController(EForgetPasswordDto efpdto){
		

		System.out.println("forgetPasswordController method started..");
		
		int affectedRow = efpService.forgetPasswordService(efpdto);
		
		if(affectedRow == 1){
			
			System.out.println("forgetPasswordController method ended");
			return new ModelAndView("/ELogin.jsp","pwd","password changed successfully!");
		}else{
			
			System.out.println("forgetPasswordController method ended");
			
			return new ModelAndView("/ForgetPassword.jsp","msg","provide valid email id");
		}
		
		
	}
	
}
