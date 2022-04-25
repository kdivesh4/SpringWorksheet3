package com.springcore.worksheet3;

import java.awt.PageAttributes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void  main (String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/worksheet3/config.xml");
		//Passenger p1 = (Passenger)context.getBean("passenger1");
		//Passenger p2 = (Passenger)context.getBean("passenger2");
		//System.out.println(p1);
		//System.out.println(p2);
		Train train = (Train) context.getBean("train");
		System.out.println(train);
	}
}
