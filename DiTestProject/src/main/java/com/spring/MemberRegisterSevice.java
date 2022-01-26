package com.spring;

import java.time.LocalDateTime;

import com.dao.Member;
import com.dao.MemberDao;
import com.dao.RegisterRequest;
import com.exception.DuplicateMemberException;

public class MemberRegisterSevice {

	//회원 가입 처리에 필요한 클래스 
	private MemberDao memberDao;
	
	public MemberRegisterSevice(MemberDao memberDao) {
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
