package com.spring;

import com.dao.Member;
import com.dao.MemberDao;
import com.exception.MemberNotFoundException;

public class ChangePasswordService {

/*	
 * 암호를 변경할 member 데이터를 찾기위해 email을 사용함
 * 만약 email에 해당하는 멤버가 없으면 익셉션 발생 
 * member가 존재하면 member.changePassword를 통해 비밀번호 변경
 */	
	private MemberDao memberDao;
	
	public void changePassword(String email, String newPwd) {
		Member member = memberDao.selectByEmail(email);
		
		if(member == null) {
			throw new MemberNotFoundException();
		}
		member.changePassword(email, newPwd);
		memberDao.insert(member);
	}
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
}
