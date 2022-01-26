package com.dao;

import java.time.LocalDateTime;

import com.exception.WrongIdPasswordException;

public class Member {

	//회원 데이터 관련 클래스, 회원의 데이터 표현을 위함
	
	public Member(String eamil, String password, String name, LocalDateTime registerLocalDateTime) {
		this.eamil = eamil;
		this.password = password;
		this.name = name;
		this.registerLocalDateTime = registerLocalDateTime;
	}
	private String eamil;
	private String password;
	private String name;
	private Long id;
	private LocalDateTime registerLocalDateTime;
	
	public LocalDateTime getRegisterLocalDateTime() {
		return registerLocalDateTime;
	}
	public void setRegisterLocalDateTime(LocalDateTime registerLocalDateTime) {
		this.registerLocalDateTime = registerLocalDateTime;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEamil() {
		return eamil;
	}
	public void setEamil(String eamil) {
		this.eamil = eamil;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//암호변경 기능
	public void changePassword(String oldPassword, String newPassword)  {
		if(!password.equals(oldPassword)) 
			{throw new WrongIdPasswordException();}
		this.password = newPassword;
	}


}


