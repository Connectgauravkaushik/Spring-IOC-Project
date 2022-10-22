package com.greatlearning.springConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.greatlearning.SpringDemo.ExpertAdvice;
import com.greatlearning.SpringDemo.PracticeAdvice;
import com.greatlearning.SpringDemo.SportsCoach;
import com.greatlearning.SpringDemo.CricketCoach;
import com.greatlearning.SpringDemo.FootballCoach;


@Configuration
@ComponentScan("com.greatlearning.SpringDemo")
public class springConfig {

	// To access the component from spring framework we have to add the bean
	@Bean
	public ExpertAdvice PracticeAdvice() {
	return new PracticeAdvice();
	}
	
	@Bean
	public SportsCoach CricketCoach() {
		return new CricketCoach(PracticeAdvice());
	}
	
	@Bean
	public SportsCoach FootballCoach() {
		return new FootballCoach();
	}
	
}
