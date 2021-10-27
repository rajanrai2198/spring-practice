package com.example.demospring28;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("girl")
public class GirlStudent implements Student {

	@Override
	public String studentName() {
		return "Sunaina";
	}

}
