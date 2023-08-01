package com.prowings.dependson;

import org.springframework.stereotype.Component;

@Component("beanB")
public class B {
	
	public B() {
		super();
		System.out.println("no arg constructor invoked for class B");
	}

	public void print()
	{
		System.out.println("inside B - print()");
	}

}
