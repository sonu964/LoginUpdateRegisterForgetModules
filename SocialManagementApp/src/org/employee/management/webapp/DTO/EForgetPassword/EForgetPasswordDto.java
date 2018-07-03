package org.employee.management.webapp.DTO.EForgetPassword;

import java.io.Serializable;


@SuppressWarnings("serial")
public class EForgetPasswordDto implements Serializable{

	private String eEmail;
	private String NewPassword;



	public EForgetPasswordDto() {

		System.out.println(this.getClass().getSimpleName()+" created");
	}


	public String geteEmail() {
		return eEmail;
	}



	public void seteEmail(String eEmail) {
		this.eEmail = eEmail;
	}



	public String getNewPassword() {
		return NewPassword;
	}



	public void setNewPassword(String newPassword) {
		NewPassword = newPassword;
	}





	@Override
	public String toString() {
		return "EForgetPasswordDto [eEmail=" + eEmail + ", NewPassword=" + NewPassword + "]";
	}

}
