package Exam;

import Exam.entity.Exam;
import Exam.entity.NewlecExam;
import Exam.ui.ExamConsole;
import Exam.ui.GridExamConsole;
import Exam.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		Exam exam = new NewlecExam();
		
		//inline 과 grid 방식 두가지로 실습 
		//ExamConsole console = new InlineExamConsole(exam); //DI
		ExamConsole console = new GridExamConsole(exam); // DI
		
		console.print();
	}
}
