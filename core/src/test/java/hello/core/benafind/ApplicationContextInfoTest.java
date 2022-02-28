package hello.core.benafind;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import hello.core.Appconfig;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

import static org.assertj.core.api.Assertions.*;

class ApplicationContextInfoTest {

	
	AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Appconfig.class);
	
	@Test
	 @DisplayName("�� �̸����� ��ȸ")
	 void findBeanByName() {
	 MemberService memberService = ac.getBean("memberService",
	MemberService.class);
	 assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
	 }
	
	 @Test
	 @DisplayName("�̸� ���� Ÿ�Ը����� ��ȸ")
	 void findBeanByType() {
	 MemberService memberService = ac.getBean(MemberService.class);
	 assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
	 }
	 
	 @Test
	 @DisplayName("��ü Ÿ������ ��ȸ")
	 void findBeanByName2() {
	 MemberServiceImpl memberService = ac.getBean("memberService",
	MemberServiceImpl.class);
	 assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
	 }
	 
	 @Test
	 @DisplayName("�� �̸����� ��ȸX")
	 void findBeanByNameX() {
	 //ac.getBean("xxxxx", MemberService.class);
	 Assertions.assertThrows(NoSuchBeanDefinitionException.class, () ->
	ac.getBean("xxxxx", MemberService.class));
	 }
}