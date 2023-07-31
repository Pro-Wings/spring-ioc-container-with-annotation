package com.prowings.componentscanfilters;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.prowings.package1.BeanC;

public class TestComponentScanFilgters {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
		
		System.out.println(ctx.getBeanDefinitionCount());
		System.out.println(Arrays.toString(ctx.getBeanDefinitionNames()));
		
		BeanC c = ctx.getBean(BeanC.class);
		
		System.out.println(c);
	}

}
