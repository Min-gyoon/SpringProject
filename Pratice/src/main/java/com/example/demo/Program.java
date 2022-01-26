package com.example.demo;

import com.example.entity.Exam;
import com.example.entity.NewlecExam;
import com.example.ui.ExamConsole;
import com.example.ui.GridExamConsole;
import com.example.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {

		
		Exam exam = new NewlecExam();
		
		ExamConsole console = new InlineExamConsole(exam);
		//ExamConsole console = new GridExamConsole(exam);
		console.print();
	}

}
 