package com.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class User {
	
	private String userName;
	@Id
	private String userEmail;
	private String userPassword;
	private String userPhone;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userName,String userEmail, String userPassword, String userPhone) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userPhone = userPhone;
	}
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userEmail=" + userEmail + ", userPassword=" + userPassword
				+ ", userPhone=" + userPhone + "]";
	}
	
	

}
