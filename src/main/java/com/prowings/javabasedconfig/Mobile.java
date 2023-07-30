package com.prowings.javabasedconfig;

public class Mobile extends Device{

    private int batteryCapacity;

	public Mobile() {
		super();
	}

	public Mobile(String name, double price) {
		super(name, price);
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	
    
}
