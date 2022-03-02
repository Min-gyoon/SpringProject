package com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Exam;
import entity.NewlecExam;
import spring.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {

		/* 스프링에게 지시하는 방법으로 코드를 변경
	    Exam exam = new NewlecExam();
		
		ExamConsole console = new GridExamConsole(exam);
		console.setExam(exam);
		
		ExamConsole console = ? 를 어떻게 표현 xml로! 
	    */
		ApplicationContext context =
				new AnnotationConfigApplicationContext("NewlecDIConfig.class");
//				new ClassPathXmlApplicationContext("setting.xml");
		ExamConsole console = (ExamConsole) context.getBean("console");
		
//		ExamConsole console = context.getBean(ExamConsole.class);
		//ExamConsole에 부합되는 객체가 있으면 그 형식으로 찾아라 "형식"
	    console.print();
	
	    
	}
	
	

}
 