package com.dat.mer.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class passwordChange {
	@NotEmpty
	@Size(min=5,max=20)
	private String oldPasswordd;
	
	@NotEmpty
	@Size(min=5,max=20)
	private String newPasswordd;
	
	@NotEmpty
	@Size(min=5,max=20)
	private String comfrmPasswordd;
	
	public String getOldPasswordd() {
		return oldPasswordd;
	}
	public void setOldPasswordd(String oldPasswordd) {
		this.oldPasswordd = oldPasswordd;
	}
	public String getNewPasswordd() {
		return newPasswordd;
	}
	public void setNewPasswordd(String newPasswordd) {
		this.newPasswordd = newPasswordd;
	}
	public String getComfrmPasswordd() {
		return comfrmPasswordd;
	}
	public void setComfrmPasswordd(String comfrmPasswordd) {
		this.comfrmPasswordd = comfrmPasswordd;
	}

}
