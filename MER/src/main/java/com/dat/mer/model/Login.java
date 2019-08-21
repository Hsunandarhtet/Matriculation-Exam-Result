package com.dat.mer.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;



public class Login {
		@NotEmpty
		@Pattern(regexp="[0-9]{3}")
		private String adminID;
		
		@NotEmpty
		private String adminPassword;

		public String getAdminID() {
			return adminID;
		}

		public void setAdminID(String adminID) {
			this.adminID = adminID;
		}

		public String getAdminPassword() {
			return adminPassword;
		}

		public void setAdminPassword(String adminPassword) {
			this.adminPassword = adminPassword;
		}
		
		
		
}