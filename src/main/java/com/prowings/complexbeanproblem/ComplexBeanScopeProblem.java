package com.prowings.complexbeanproblem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComplexBeanScopeProblem {
	
	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(CarConfig.class);
		context.refresh();
		
		FourWheeler audi1 = context.getBean(FourWheeler.class);
		
		System.out.println("Audi1 : "+audi1);
		
		FourWheeler audi2 = context.getBean(FourWheeler.class);
		System.out.println("Audi2 : "+audi2);
				
		System.out.println(audi1 == audi2);

		System.out.println(audi1.getEngine() == audi2.getEngine());
		
	}

}
