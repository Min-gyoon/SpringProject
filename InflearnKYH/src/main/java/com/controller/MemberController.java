package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.domain.Member;
import com.service.MemberService;

@Controller
public class MemberController {
	
	 private final MemberService memberService;
	 
	 /* 생성자에 @Autowired 가 있으면 스프링이 연관된 객체를 스프링 컨테이너에서 찾아서 넣어준다. 이렇게
        객체 의존관계를 외부에서 넣어주는 것을 DI (Dependency Injection), 의존성 주입이라 한다.
        이전 테스트에서는 개발자가 직접 주입했고, 여기서는 @Autowired에 의해 스프링이 주입해준다.*/
	 @Autowired
	 public MemberController(MemberService memberService) {
	 this.memberService = memberService;
	 }
	 
	 @GetMapping("/members/new")
	 public String createForm() {
		 return "members/createMemberForm";
	 }
	 
	 @PostMapping("/members/new")
	 public String create(MemberForm form) {
	  Member member = new Member();
	  member.setName(form.getName());
	  System.out.println("name = "+member.getName());
	  memberService.join(member);
	  return "redirect:/";
	 }
	 
	 @GetMapping(value = "/members")
	 public String list(Model model) {
	  List<Member> members = memberService.findMembers();
	  model.addAttribute("members", members);
	  return "members/memberList";
	 }
}
