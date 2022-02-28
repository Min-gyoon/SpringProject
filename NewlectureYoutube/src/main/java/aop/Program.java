package aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.aop.copy.Exam;
import entity.aop.copy.NewlecExam;
import ui.ExamConsole;
import ui.GridExamConsole;

public class Program {

	public static void main(String[] args) {
		
		//Exam exam = new NewlecExam(1,1,1,1);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("setting.xml");
		//Exam exam =  (ExamConsole) context.getBean("console");
		GridExamConsole exam =  context.getBean(GridExamConsole.class);
		
		System.out.printf("total is %d",((Exam) exam).total());
		
	}
}
