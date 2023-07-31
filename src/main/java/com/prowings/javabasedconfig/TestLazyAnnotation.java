package com.prowings.javabasedconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestLazyAnnotation {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ShoppingListConfig.class);
		
		System.out.println("count >>> "+ctx.getBeanDefinitionCount());
		
		
		
	}
	

}
