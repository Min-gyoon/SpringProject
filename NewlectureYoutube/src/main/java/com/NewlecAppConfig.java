package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import entity.Exam;
import entity.NewlecExam;

@Component
@ComponentScan("ui")
public class NewlecAppConfig {

	@Bean
	public Exam exam() {
		return new NewlecExam();
	}
}
