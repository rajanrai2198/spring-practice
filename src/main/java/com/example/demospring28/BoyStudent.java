package com.example.demospring28;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("boy")
public class BoyStudent implements Student {

	@Override
	public String studentName() {
		return "Rajan";
	}

}
