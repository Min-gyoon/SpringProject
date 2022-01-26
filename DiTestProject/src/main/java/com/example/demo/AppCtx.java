package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dao.MemberDao;
import com.spring.MemberRegisterSevice;
import com.spring.ChangePasswordService;

@Configuration // 스프링 설정 클래스를 의미 이것을 붙여야 스프링 설정 클래스로 사용할 수 있음
public class AppCtx {
	@Bean 
	public MemberDao memberDao() { 
		return new MemberDao();
		//memberDao() 메소드를 이용해 생성된 빈 객체 MemberDao라는 이름으로 스프링에 등록됨
	}
	
	@Bean
	public MemberRegisterSevice memberRegisterSevice() {
		return new MemberRegisterSevice(memberDao());
	}
	@Bean
	public ChangePasswordService changePasswordService() {
		ChangePasswordService pwdSvc = new ChangePasswordService();
		pwdSvc.setMemberDao(memberDao());
		return pwdSvc;
	}
	

}
