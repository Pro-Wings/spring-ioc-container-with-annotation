package com.prowings.javabasedconfig.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value(value = "10")
	private int roll;
	
	@Value(value = "Ram")
	private String name;
	
	@Autowired
	@Qualifier("address1")
	private Address address;
	
	public Student() {
		super();
	}

	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("address setter invoked!!");
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
