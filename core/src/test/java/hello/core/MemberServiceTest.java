package hello.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class MemberServiceTest {

	//DIP ����
	MemberService memberservice = new MemberServiceImpl();
	
	
	@Test
	void join() {
		
		//given
		
		Member member = new Member(1L,"memberA",Grade.VIP);
		//when
		memberservice.join(member);
		Member findMember = memberservice.findMember(1L);
		//then
		
		//Assertions.assertTh
	}
}