package com.greatlearning.SpringDemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements SportsCoach {

	private ExpertAdvice expertadvice;

	//When we want to add via constructor dependency then we will use constructor-args
	public CricketCoach(ExpertAdvice expertadvice) {
		this.expertadvice = expertadvice;
	}

	@Override
	public String GetTrainingScehdule() {
		return "Do Practice at 6 am";
	}

	@Override
	public String GetAdvice() {
		// TODO Auto-generated method stub
		return expertadvice.GetExpertAdvice();
	}

}
