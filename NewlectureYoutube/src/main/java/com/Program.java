package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Exam;
import entity.NewlecExam;
import ui.ExamConsole;
import ui.GridExamConsole;
import ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {

		
	    Exam exam = new NewlecExam();
		
		ExamConsole console = new InlineExamConsole(exam);
		//ExamConsole console = new GridExamConsole();
		//console.setExam(exam);
	    ApplicationContext context = new AnnotationConfigApplicationContext(NewlecAppConfig.class);
		console.print();
	}

}
 