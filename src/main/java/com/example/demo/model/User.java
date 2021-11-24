package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loginId;
	
	@Column(name="user_name" , nullable=false)
	private String userName;
	@Column(name="user_password" , nullable=false)
	private String userPassword;
	
	public User()
	{}
	
	public User(int loginId, String userName, String userPassword) {
		super();
		this.loginId = loginId;
		this.userName = userName;
		this.userPassword = userPassword;
	}
	
	public int getLoginId() {
		return loginId;
	}
	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	@Override
	public String toString() {
		return "User [loginId=" + loginId + ", userName=" + userName + ", userPassword=" + userPassword + "]";
	}
	
}
