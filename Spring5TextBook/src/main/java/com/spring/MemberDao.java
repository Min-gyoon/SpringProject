package com.spring;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//회원 데이터 관련 클래스
public class MemberDao {
private static long nextId = 0 ;
	
	private Map<String, Member> map = new HashMap<>();
	
	public Member selectByEmail(String email) {
		return map.get(email);
	}
	
	public void insert(Member member) {
		member.setId(++nextId);
		map.put(member.getEamil(), member);
	}
	
	public void update(Member member) {
		map.put(member.getEamil(), member);
	}
	public Collection<Member> selectAll(){
		return map.values();
	}
}