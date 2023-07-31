package com.prowings.complexbeanproblem;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Engine {

	@Value(value = "2")
	int capacity;
	@Value(value = "V12")
	String type;
	@Value(value = "2000")
	int hp;
	
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	@Override
	public String toString() {
		return "Engine [capacity=" + capacity + ", type=" + type + ", hp=" + hp + "]";
	}
	
	
	
}
