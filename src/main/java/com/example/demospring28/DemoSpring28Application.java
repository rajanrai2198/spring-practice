package com.example.demospring28;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoSpring28Application {

	
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(DemoSpring28Application.class, args);
		School school = applicationContext.getBean(BoySchool.class);
		System.out.println(school.schoolName());
	}

}
