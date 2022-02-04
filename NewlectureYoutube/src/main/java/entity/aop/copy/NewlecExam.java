package entity.aop.copy;

public class NewlecExam implements Exam {

	
	private int kor, eng, math, com;
	
	
	
	public NewlecExam() {
		super();
	}
	public NewlecExam(int kor, int eng, int math, int com) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.com = com;
	}
	@Override
	public int total() {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		int result = kor+eng+math+com;
		try {
			Thread.sleep(200);;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		String message = (end-start) + "ms 시간이 걸렸습니다";
		System.out.println(message);
		return result;
	}
	@Override
	public float avg() {
		// TODO Auto-generated method stub;
		float result = total()/4.0f;
		
		
		return result;
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
}
