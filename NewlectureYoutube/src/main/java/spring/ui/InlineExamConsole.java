package spring.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import entity.Exam;

@Component("console")
@Repository
public class InlineExamConsole implements ExamConsole {
	
	@Autowired
	private Exam exam;
	
	public InlineExamConsole() {
		System.out.println("생성자");
	}
	public InlineExamConsole(Exam exam) {
		System.out.println("오버로드 생성자");
		this.exam = exam;
	}
	@Override
	public void setExam(Exam exam) {
		System.out.println("세터 인젝션");
		this.exam = exam;
	}
	@Override
	public void print() {
		System.out.printf("total is %d, avg is %f\n",exam.total(), exam.avg());
		
	}
	

}
