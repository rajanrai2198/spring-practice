package com.example.demospring28;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GirlSchool implements School {

	@Autowired
	@Qualifier("girl")
	private Student student;
	
	public GirlSchool(Student student) {
		this.student = student;
	}

	@Override
	public String schoolName() {
		return student.studentName()+" in Girl school.";
	}

}
