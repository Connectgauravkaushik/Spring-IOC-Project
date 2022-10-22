package com.greatlearning.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements SportsCoach {

	private ExpertAdvice expertAdvice;

	// for setter dependency we use property

	public ExpertAdvice getExpertAdvice() {
		return expertAdvice;
	}

	@Autowired
	public void setExpertAdvice(ExpertAdvice expertAdvice) {
		this.expertAdvice = expertAdvice;
	}

	@Override
	public String GetTrainingScehdule() {
		// TODO Auto-generated method stub
		return "practice time is at 5am";
	}

	@Override
	public String GetAdvice() {
		// TODO Auto-generated method stub
		return expertAdvice.GetExpertAdvice();
	}

}
