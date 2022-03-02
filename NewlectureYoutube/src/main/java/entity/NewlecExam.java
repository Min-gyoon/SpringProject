package entity;

import org.springframework.stereotype.Component;

@Component
public class NewlecExam implements Exam {
	
	private int kor, eng, math, com;
	private Exam exam;
	
	
	public NewlecExam() {
	}


	public NewlecExam(int eng, int kor, int math, int com) {
		this.eng = eng;
		this.kor = kor;
		this.math = math;
		this.com = com;
	}


	public void setKor(int kor) {
		this.kor = kor;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}


	public void setMath(int math) {
		this.math = math;
	}


	public void setCom(int com) {
		this.com = com;
	}


	@Override
	public int total() {
		return kor+eng+math+com;
	}
	

	@Override
	public float avg() {
		// TODO Auto-generated method stub
		return total()/4.0f;
	}

	@Override
	public void setExam(Exam exam) {
		// TODO Auto-generated method stub
		this.exam = exam;
	}

}
