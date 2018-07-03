package org.employee.management.webapp.DTO.UpdateMobileNumber;

import java.io.Serializable;

@SuppressWarnings("serial")
public class UpdateMobileNumberDto implements Serializable{

	private String eEmail;
	private String eMobile;



	public UpdateMobileNumberDto() {

		System.out.println(this.getClass().getSimpleName()+" created");
	}

	public String geteEmail() {
		return eEmail;
	}

	public void seteEmail(String eEmail) {
		this.eEmail = eEmail;
	}
	public void seteMobile(String eMobile) {
		this.eMobile = eMobile;
	}

	public String geteMobile() {
		return eMobile;
	}


	


}
