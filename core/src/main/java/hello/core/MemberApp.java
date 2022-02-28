package hello.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class MemberApp {

		public static void main(String[] args) {
			
			
//			Appconfig appconfig = new Appconfig();
//			MemberService memberService = appconfig.memberService();

			ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
			//스프링이 저 해당 클래스 파일의 빈들을 스프링 컨테이너가 객체 관리를 해주는 것 
			//직접 찾아오는것이 아닌 17번라인처럼 : 컨테이너가 대신 해줌 
			
			MemberService memberService =  applicationContext.getBean("memberService",MemberService.class);
			
			Member member = new Member(1L,"memberA",Grade.VIP);
			memberService.join(member);
			
			Member finMember = memberService.findMember(1L);
			System.out.println("find Member = "+finMember.getName());
			System.out.println("new Member = "+member.getName());
		}
}
