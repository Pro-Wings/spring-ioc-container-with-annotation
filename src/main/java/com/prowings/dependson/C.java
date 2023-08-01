package com.prowings.dependson;

import org.springframework.stereotype.Component;

@Component("beanC")
public class C {

	public C() {
		super();
		System.out.println("no arg constructor invoked for class C");
	}

}
