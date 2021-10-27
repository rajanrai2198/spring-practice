package com.example.demospring28;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BoySchool implements School {
	
	@Autowired
	@Qualifier("boy")
	private Student student;
	
//	public BoySchool(Student student) {
//		this.student = student;
//	}

	@Override
	public String schoolName() {
		return student.studentName()+" in Boys School";
	}

}
