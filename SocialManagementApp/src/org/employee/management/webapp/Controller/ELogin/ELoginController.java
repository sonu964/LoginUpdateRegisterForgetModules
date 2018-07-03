package org.employee.management.webapp.Controller.ELogin;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.employee.management.webapp.DTO.ELogin.ELoginDto;
import org.employee.management.webapp.DTO.ERegister.ERegisterDto;
import org.employee.management.webapp.Services.ELogin.ELoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/")
@Controller
public class ELoginController {

	@Autowired
	ELoginService eLoginService;

	public ELoginController() {

		System.out.println(this.getClass().getSimpleName()+" created");


	}

	@RequestMapping(value="elogin.do",method=RequestMethod.POST)
	public ModelAndView empLoginController(ELoginDto eldto, HttpServletRequest req){

		System.out.println("empLoginController method started..");

		ERegisterDto erdtoFromDB = eLoginService.empLoginService(eldto);
		
		if(erdtoFromDB != null){
			System.out.println("empLoginController method ended");
			
			HttpSession httpSession = req.getSession(true);
			
			httpSession.setAttribute("erdto", erdtoFromDB);
			
			return new ModelAndView("/ELanding.jsp","nm",erdtoFromDB.geteName());

		}else{
			System.out.println("empLoginController method ended");
			return new ModelAndView("/ELogin.jsp","msg","Invalid user, try again");
		}
	}

}
