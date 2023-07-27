package com.prowings.models;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestContainer {
	
	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("AutowiringSpringBeans.xml");

	
		Car c1 = context.getBean("car1", Car.class);
		
		System.out.println(c1);
		
		Student s1 = context.getBean("std1",Student.class);
		
		System.out.println(s1);
	}

}
