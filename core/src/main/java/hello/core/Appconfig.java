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
		return new MemoryMemberRepository(); //db를 사용할려면 여기만 변경하면 된다
	}
	@Bean
	public DiscountPolicy discountPolicy() {
//		return new FixDiscountPolicy(); // 다른 할인정책을 사용할려고 하면 여기만 변경하면 된다
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
