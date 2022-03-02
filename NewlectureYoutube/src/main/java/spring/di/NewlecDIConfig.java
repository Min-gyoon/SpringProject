package spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import entity.Exam;
import entity.NewlecExam;

@Configuration
@ComponentScan("ui")
public class NewlecDIConfig {

	
		@Bean
		public Exam exam() {
			return new NewlecExam();
		}
}
