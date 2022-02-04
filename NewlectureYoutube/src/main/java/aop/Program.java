package aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import entity.aop.copy.Exam;
import entity.aop.copy.NewlecExam;

public class Program {

	public static void main(String[] args) {
		
		Exam exam = new NewlecExam(1,1,1,1);
		
		Exam proxy = Proxy.newProxyInstance(NewlecExam.class,new Class[] {Exam.class}, new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				
				return null;
			}
		});
		
		System.out.printf("total is %d",exam.total());
		
	}
}
