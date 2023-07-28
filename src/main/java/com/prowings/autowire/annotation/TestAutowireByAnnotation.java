package com.prowings.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowireByAnnotation {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("AutowiringByAnnotationSpringBeans.xml");

//		Employee e1 = context.getBean("emp1", Employee.class);
//		System.out.println(e1);
		
		Department d1 = context.getBean(Department.class);
		System.out.println(d1);
		
		
		Employee e3 = context.getBean("emp3", Employee.class);
		System.out.println(e3); 

		Manager m1 = context.getBean("mngr1",Manager.class);
		System.out.println(m1);
	}

	
	
}
