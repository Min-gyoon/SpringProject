package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//자바코드로 빈 객체를 설정한 파일 
public class AppCtx {

	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}
	
	@Bean
	//생성자를 통한 의존 주입
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService(memberDao());
	}
	
	@Bean
	//세터를 통해 의존 주입
	public ChangePasswordService changePasswordSvc() {
		ChangePasswordService pwdSvc = new ChangePasswordService();
//		pwdSvc.setMemberDao(memberDao()); 자동주입으로 인한 없어도 되는 코드
		return pwdSvc;
	}
}
