package hello.core.xml;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;import hello.core.member.Member;
import hello.core.member.MemberService;

public class XmlAppContext {

	
	@Test
	void xmlAppContext() {
		ApplicationContext ac = new GenericXmlApplicationContext("AppConfig.xml");
		MemberService memberService = ac.getBean("memberSerivce",MemberService.class);
		
		Assertions.assertThat(memberService).isInstanceOf(MemberService.class);
	}
}
