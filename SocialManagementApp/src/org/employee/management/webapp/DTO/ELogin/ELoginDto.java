package org.employee.management.webapp.DTO.ELogin;

import java.io.Serializable;

/**
 * @author Sonu Shaw
 *
 */
@SuppressWarnings("serial")
public class ELoginDto implements Serializable{

	private int eId;
	private String ePassword;



	public ELoginDto() {

		System.out.println(this.getClass().getSimpleName()+" created");
	}

	public int geteId() {
		return eId;
	}


	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getePassword() {
		return ePassword;
	}

	public void setePassword(String ePassword) {
		this.ePassword = ePassword;
	}


	@Override
	public String toString() {
		return "ELoginDto [id=" + eId + ", password=" + ePassword + "]";
	}



}
