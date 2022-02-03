package com.spring;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import com.exception.DuplicateMemberException;

//회원 등록 서비스
@Component
public class MemberRegisterService {

	private MemberDao memberDao;
	//회원 가입 처리에 필요한 클래스 
	/*의존 객체를 직접 생성하지 않고 생성자를 통해 의존 객체를 전달 받음 
	즉, 생성자를 통해 MemberRegisterService가 의존하고 있는 MemberDao 객체를 주입 받는 것 
	그 결과 다른 클래스에서 MemberRegisterService 클래스를 사용하기 위해선 
	MemberDao 인스턴스화 하고 MemberRegisterService 객체를 생성할 때 객체를 전달해주어야 한다
	*/
	public MemberRegisterService(MemberDao memberDao) {
		this.memberDao = memberDao; 
	}					
	public Long regist(RegisterRequest req) {
		Member member = memberDao.selectByEmail(req.getEmail());
		
		if(member != null) {
			throw new DuplicateMemberException("dup email " + req.getEmail());
		}
		Member newMember = new Member(req.getEmail(),req.getPassword(),req.getName(),LocalDateTime.now());
		
		memberDao.insert(newMember);
		return newMember.getId();
		
	}
}
