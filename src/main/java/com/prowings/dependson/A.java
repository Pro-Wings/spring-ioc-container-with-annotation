package com.prowings.dependson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn({"beanC", "beanB"})
public class A {

//	@Autowired
	B b;
	
	@Autowired
	public A(B b) {
		super();
		this.b = b;
		System.out.println("one arg constructor invoked for class A");
	}

	public A() {
		super();
		System.out.println("no arg constructor invoked for class A");
	}
	
	public void call()
	{
		b.print();
	}
	

}
