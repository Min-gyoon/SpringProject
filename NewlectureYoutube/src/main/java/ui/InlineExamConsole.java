package ui;

import org.springframework.beans.factory.annotation.Autowired;

import entity.Exam;

public class InlineExamConsole implements ExamConsole {

	
	@Autowired
	private Exam exam;
	
	public InlineExamConsole(Exam exam) {
		this.exam = exam;
	}
	
	
	
	@Override
	public void print() {
		System.out.printf("total is %d, avg is %f \n",exam.total(), exam.avg());
	}
	@Override
	public void setExam(Exam exam) {
		// TODO Auto-generated method stub
		
	}
	

}
