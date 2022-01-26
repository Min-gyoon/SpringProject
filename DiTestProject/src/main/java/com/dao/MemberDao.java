package com.dao;

import java.util.HashMap;
import java.util.Map;

public class MemberDao {

	//실질적인 멤버의 데이터를 담고 있는 곳, 값을 넣는 클래스
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
	
}
