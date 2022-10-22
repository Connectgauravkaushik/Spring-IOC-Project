package com.greatlearning.SpringDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.greatlearning.springConfig.springConfig;

public class SpringMain {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(springConfig.class);

		System.out.println("------------The Cricket Coach------------");
		SportsCoach spCoach = ctx.getBean("CricketCoach", SportsCoach.class);

		System.out.println("The timing is : " + spCoach.GetTrainingScehdule());
		System.out.println("The Advice is : " + spCoach.GetAdvice());
		System.out.println();
		System.out.println("------------The Football Coach------------");
		spCoach = ctx.getBean("FootballCoach", SportsCoach.class);

		System.out.println("The timing is : " + spCoach.GetTrainingScehdule());
		System.out.println("The Advice is : " + spCoach.GetAdvice());

	}

}
