package com.prowings.dependson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDependsOn {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(BeansConfig.class);
		
		A a = ctx.getBean(A.class);
		
		a.call();
		
		
	}

}
