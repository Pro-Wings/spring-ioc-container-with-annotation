package com.prowings.autowire.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "mngr1")
public class Manager {
	@Value(value = "1234")
	int id;
	@Value(value = "ZZZZ")
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + "]";
	}
	
	 

}
