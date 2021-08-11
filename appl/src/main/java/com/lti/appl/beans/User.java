package com.lti.appl.beans;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="users")
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="User_id")
//	@OneToOne
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="USER_GEN")
    @SequenceGenerator(name="USER_GEN",sequenceName="user_seq",allocationSize=1)
	private int userId;
	
	@Column(name="username")
	private String userName;
	
	@Column(name="email")
	private String userEmail;
	
	@Column(name="Dob")
	private Date userDob;
	
	@Column(name="Mobile_Num")
	private Long phone;
	
	@Column(name="Address")
	private String userAddr;
	
	@Column(name="password")
	private String userPswd;

	public User() {
		super();
	}
	
	

	public User(int userId, String userName, String userEmail, Date userDob, Long phone, String userPswd) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userDob = userDob;
		this.phone = phone;
		this.userPswd = userPswd;
	}



	public User(String userName, String userEmail, Date userDob, Long phone, String userAddr, String userPswd) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.userDob = userDob;
		this.phone = phone;
		this.userAddr = userAddr;
		this.userPswd = userPswd;
	}

	public User(int userId, String userName, String userEmail, Date userDob, Long phone, String userAddr,
			String userPswd) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userDob = userDob;
		this.phone = phone;
		this.userAddr = userAddr;
		this.userPswd = userPswd;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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
	@JsonIgnore
	public Date getUserDob() {
		return userDob;
	}

	public void setUserDob(Date userDob) {
		this.userDob = userDob;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}
	@JsonIgnore
	public String getUserAddr() {
		return userAddr;
	}

	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}
	@JsonIgnore
	public String getUserPswd() {
		return userPswd;
	}

	public void setUserPswd(String userPswd) {
		this.userPswd = userPswd;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userDob=" + userDob
				+ ", phone=" + phone + ", userAddr=" + userAddr + ", userPswd=" + userPswd + "]";
	}
	
	
}