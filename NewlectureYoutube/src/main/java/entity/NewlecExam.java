package entity;

public class NewlecExam implements Exam {

	
	private int kor, eng, math, com;
	
	@Override
	public int total() {
		
		
		return kor+eng+math+com;
	}
	

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public int getCom() {
		return com;
	}

	@Override
	public float avg() {
		// TODO Auto-generated method stub
		return total()/4.0f;
	}

}
