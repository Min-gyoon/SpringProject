package Exam;

import java.util.HashMap;
import java.util.Map;



class A{
	String name;
	String color;
	String a;
}
class B extends A{

}
interface C{
	
}
class D{
	
}
public class TestCode {
	private static final A A = null;

	public static void main(String[] args) {
		Map<String,A> map = new HashMap<>();
		A a = new A();
		a.name="As";
		a.color="blue";
		a.a="not";
		System.out.println(map.get("name"));
		
	A a2 = new B();
	}

}
