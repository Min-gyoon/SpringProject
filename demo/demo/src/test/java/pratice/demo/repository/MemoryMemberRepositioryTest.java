package pratice.demo.repository;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import pratice.demo.domain.Member;

public class MemoryMemberRepositioryTest {

	MemberRepository repository = new MemoryMemberRepository();
	
	@Test
	public void 저장() {
		Member member = new Member();
		member.setName("String");
		
		repository.save(member);
		Member result = repository.findById(member.getId()).get();
		
		
		
		Assertions.assertEquals(member, result);
	}
	
	@Test
	public void findById() {
		Member member1 = new Member();
		member1.setName("spring1");
		repository.save(member1);
		
		Member member2 = new Member();
		member1.setName("spring2");
		repository.save(member2);
		
		Member result = repository.findByName("spring2").get();
		
		Assertions.assertEquals(member1, result);
	}
	
	@Test
	public void findAll() {
		Member member1 = new Member();
		member1.setName("spring1");
		repository.save(member1);
		
		Member member2 = new Member();
		member1.setName("spring2");
		repository.save(member2);
		
		List<Member> result = repository.findall();
		
	}
}
