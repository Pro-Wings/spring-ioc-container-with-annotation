package com.prowings.javabasedconfig;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Laptop extends Device {
	
    private boolean touchScreen;

	public Laptop() {
		super();
	}

	public Laptop(String name, double price) {
		super(name, price);
	}

	public boolean isTouchScreen() {
		return touchScreen;
	}

	public void setTouchScreen(boolean touchScreen) {
		this.touchScreen = touchScreen;
	}

	@PostConstruct
    public void init()
    {
    	System.out.println("Laptop bean is created!!");
    }

	@PreDestroy
	public void destroy()
	{
		System.out.println("Laptop bean is destroying!!");
	}

}
