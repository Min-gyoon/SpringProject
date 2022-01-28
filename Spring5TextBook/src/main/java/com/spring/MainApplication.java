package com.spring;

import java.io.IOException;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class MainApplication {

	@Autowired
	private static ApplicationContext ctx = null;
	
	public static void main(String[] args) throws IOException{
		ctx = new AnnotationConfigApplicationContext(AppCtx.java);
	}

}
