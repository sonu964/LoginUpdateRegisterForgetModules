package org.employee.management.webapp.Controller.UpdateMobileNumber;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.employee.management.webapp.DTO.ERegister.ERegisterDto;
import org.employee.management.webapp.DTO.UpdateMobileNumber.UpdateMobileNumberDto;
import org.employee.management.webapp.Services.UpdateMobileNumber.UpdateMobileNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/")
@Controller
public class UpdateMobileNumberController {

	@Autowired
	UpdateMobileNumberService umnService;

	public UpdateMobileNumberController() {

		System.out.println(this.getClass().getSimpleName()+" created");
	}


	@RequestMapping(value="updatemobilenumber.do",method=RequestMethod.POST)
	public ModelAndView updateMoblieNumController(UpdateMobileNumberDto umnDto, HttpServletRequest req){

		System.out.println("updateMoblieNumController method started..");

		//ERegisterDto erDto = new ERegisterDto();

		int mobileAffectedCol = umnService.updateMoblieNumService(umnDto);

		/*HttpSession session = req.getSession(false);

		if(session != null && mobileAffectedCol == 1){

			ERegisterDto erDto = (ERegisterDto)req.getAttribute("regDto");
			System.out.println("========="+erDto.geteAddress()+erDto.geteName());
			System.out.println("updateMoblieNumController method ended");
			return new ModelAndView("/ELanding.jsp","nm", " "+erDto.geteName()+" and your mobile number successfully updated ");

		}else{

			System.out.println("updateMoblieNumController method ended");
			return new ModelAndView("/UpdateMobileNumber.jsp","msg"," Please enter valid email and try again.. ");

		}*/

		HttpSession httpSession = req.getSession(false);

		if(httpSession != null){


			if( mobileAffectedCol == 1){

				System.out.println("updateMoblieNumController method ended");


				ERegisterDto erdto = (ERegisterDto)httpSession.getAttribute("erdto");

				return new ModelAndView("/ELanding.jsp","nm",""+erdto.geteName()+" your mobile number successfully updated ");


			}else{

				System.out.println("updateMoblieNumController method ended");
				return new ModelAndView("/UpdateMobileNumber.jsp","msg"," Please enter valid email and try again.. ");
			}

		}else{

			return new ModelAndView("/ELogin.jsp","msg","Invalid session");
		}

	}
}
