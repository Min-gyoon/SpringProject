package com;

public class InlineExamConsole implements ExamConsole {

	public InlineExamConsole(Exam exam) {
		this.exam = exam;
	}
	private Exam exam;
	@Override
	public void print() {
		System.out.printf("total is %d, avg is %f \n",exam.total(), exam.avg());
	}
	@Override
	public void setExam(Exam exam) {
		// TODO Auto-generated method stub
		
	}
	

}
