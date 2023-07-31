package com.prowings.javabasedconfig.qualifier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.prowings.javabasedconfig.qualifier")
public class StudentAddressConfig {
	
	@Bean
	public Address address1()
	{
		return new Address(123, "Pune");
	}

	@Bean
	@Primary
	public Address address2()
	{
		return new Address(345, "Mumbai");
	}

}
