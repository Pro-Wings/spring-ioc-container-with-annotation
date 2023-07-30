package com.prowings.javabasedconfig;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.prowings.javabasedconfig")
public class ShoppingListConfig {
	
	@Bean(name = "lenovo")
	public Device getLenovoLaptop()
	{
		Laptop lenovo = new Laptop();
		lenovo.setName("LENOVO 12");
		lenovo.setPrice(45000);
		lenovo.setTouchScreen(true);
		return lenovo;
	}

	@Bean(name = "hp")
	public Device getHpLaptop()
	{
		Laptop hp = new Laptop();
		hp.setName("HP 55");
		hp.setPrice(55000);
		hp.setTouchScreen(false);
		return hp;
	}

	@Bean(name = "iPhone")
	@Scope("prototype")
	public Device getIphone()
	{
		Mobile iPhone = new Mobile();
		iPhone.setName("iPhone 14 PRO");
		iPhone.setPrice(100000);
		iPhone.setBatteryCapacity(20000);
		return iPhone;
	}

	@Bean(name = "mIPhone")
	@Primary
	public Device getMIphone()
	{
		Mobile mIPhone = new Mobile();
		mIPhone.setName("MI A6");
		mIPhone.setPrice(10000);
		mIPhone.setBatteryCapacity(30000);
		return mIPhone;
	}

}
