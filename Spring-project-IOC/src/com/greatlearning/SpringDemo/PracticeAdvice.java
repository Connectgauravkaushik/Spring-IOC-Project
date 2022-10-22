package com.greatlearning.SpringDemo;

import org.springframework.stereotype.Component;

@Component
public class PracticeAdvice implements ExpertAdvice {

	@Override
	public String GetExpertAdvice() {
		
		return "Do practice 4 hrs a day ";
	}

}