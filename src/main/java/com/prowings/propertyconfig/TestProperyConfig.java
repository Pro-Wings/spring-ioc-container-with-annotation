package com.prowings.propertyconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestProperyConfig {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(DbConfig.class);

		MyDatabaseDetails db = ctx.getBean(MyDatabaseDetails.class);
		
		System.out.println(db);

	}

}
