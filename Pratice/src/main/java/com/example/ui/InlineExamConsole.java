package com.example.ui;

import com.example.entity.Exam;

public class InlineExamConsole implements ExamConsole {

	public InlineExamConsole(Exam exam) {
		this.exam = exam;
	}
	private Exam exam;
	@Override
	public void print() {
		System.out.printf("total is %d, avg is %f \n",exam.total(), exam.avg());
	}
	

}
