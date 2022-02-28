package hello.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberRepository;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;


@Configuration
public class Appconfig {

	
	@Bean
	public MemberRepository memberRepository() {
		return new MemoryMemberRepository(); //db�� ����ҷ��� ���⸸ �����ϸ� �ȴ�
	}
	@Bean
	public DiscountPolicy discountPolicy() {
//		return new FixDiscountPolicy(); // �ٸ� ������å�� ����ҷ��� �ϸ� ���⸸ �����ϸ� �ȴ�
		return new RateDiscountPolicy();
	}
	
	@Bean
	public MemberService memberService() {
		return new MemberServiceImpl(memberRepository());
	}
	
	@Bean
	public OrderService orderService() {
		return new OrderServiceImpl(memberRepository(),discountPolicy());
	}
}
