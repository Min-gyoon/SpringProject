package com;



public class Program {

	public static void main(String[] args) {

		
		Exam exam = new NewlecExam();
		
		ExamConsole console = new InlineExamConsole(exam);
		//ExamConsole console = new GridExamConsole(exam);
		console.setExam(exam);
		console.print();
	}

}
 