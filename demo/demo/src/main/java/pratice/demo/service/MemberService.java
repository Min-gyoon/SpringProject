package pratice.demo.service;

import java.util.List;
import java.util.Optional;


import pratice.demo.domain.Member;
import pratice.demo.repository.MemoryMemberRepository;

public class MemberService {

	private final MemoryMemberRepository memberRepository = new MemoryMemberRepository();
	
	// 회원가입
	
	public Long join (Member member) {
		//중복회원 불가 
		
		validateDuplicateMember(member);//중복회원 검증
		memberRepository.save(member);
	
		return member.getId();
	}

	private void validateDuplicateMember(Member member) {
		memberRepository.findByName(member.getName())
				.ifPresent(m ->{
			throw new IllegalStateException("이미 존재하는 회원입니다");
		});
	}
	
	public List<Member> findMember(){
		return memberRepository.findall();
	}
	
	public Optional<Member> findOne(Long memberId){
		return memberRepository.findById(memberId);
	} 
}