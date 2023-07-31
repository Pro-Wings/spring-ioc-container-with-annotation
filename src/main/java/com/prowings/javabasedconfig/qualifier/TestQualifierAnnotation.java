package com.prowings.javabasedconfig.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestQualifierAnnotation {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(StudentAddressConfig.class);

		Student s1 = ctx.getBean(Student.class);
		
		System.out.println(s1);
	}

}
