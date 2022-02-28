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
			//�������� �� �ش� Ŭ���� ������ ����� ������ �����̳ʰ� ��ü ������ ���ִ� �� 
			//���� ã�ƿ��°��� �ƴ� 17������ó�� : �����̳ʰ� ��� ���� 
			
			MemberService memberService =  applicationContext.getBean("memberService",MemberService.class);
			
			Member member = new Member(1L,"memberA",Grade.VIP);
			memberService.join(member);
			
			Member finMember = memberService.findMember(1L);
			System.out.println("find Member = "+finMember.getName());
			System.out.println("new Member = "+member.getName());
		}
}
