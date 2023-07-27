package com.prowings.models;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Configuration
//@Component
@Service
public class MySpringContextConfig {
	
	@Bean(name = "std1")
	public Student getStudent()
	{
		Student s = new Student();
		s.setRoll(20);
		s.setName("Sham");
		s.setAddress("Mumbai");
		return s;
	}

	@Bean(name = "std3")
	public Student getStudent1()
	{
		Student s = new Student();
		s.setRoll(30);
		s.setName("AAA");
		s.setAddress("Dubai");
		return s;
	}

}
