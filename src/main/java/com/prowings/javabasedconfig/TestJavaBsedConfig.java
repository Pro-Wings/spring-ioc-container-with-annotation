package com.prowings.javabasedconfig;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestJavaBsedConfig {
	
	public static void main(String[] args) {
		
//		ApplicationContext context = new AnnotationConfigApplicationContext(ShoppingListConfig.class);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.register(ShoppingListConfig.class);
		context.refresh();
		
		System.out.println("Total Beans in container : "+context.getBeanDefinitionCount());
		
		System.out.println("Bean names : "+Arrays.toString(context.getBeanDefinitionNames()));
		
		Device lenovoLaptop = context.getBean("lenovo", Laptop.class);
		Device hpLaptop = context.getBean("hp", Laptop.class);
		
		Device iPhone = context.getBean("iPhone", Mobile.class);
		Device mIPhone = context.getBean("mIPhone", Mobile.class);
		
		System.out.println(lenovoLaptop);
		System.out.println(hpLaptop);
		System.out.println(iPhone);
		System.out.println(mIPhone);
		
		ShoppingList list1 = context.getBean(ShoppingList.class);
		list1.addItem(mIPhone);
		list1.addItem(lenovoLaptop);
		System.out.println("Shopping List 1 : "+list1.getItems());

		ShoppingList list2 = context.getBean(ShoppingList.class);
		list2.addItem(iPhone);
		list2.addItem(hpLaptop);
		System.out.println("Shopping List 2 : "+list2.getItems());

		
		System.out.println(list1 == list2);
		
		System.out.println("Total Beans in container : "+context.getBeanDefinitionCount());
		
		System.out.println("Bean names : "+Arrays.toString(context.getBeanDefinitionNames()));

	}

}
