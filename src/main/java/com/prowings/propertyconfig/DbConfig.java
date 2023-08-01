package com.prowings.propertyconfig;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:db.properties")
@ComponentScan("com.prowings.propertyconfig")
public class DbConfig {
	
    @Autowired
    Environment env;	
    
    @Bean
    public MyDatabaseDetails dbDetails()
    {
    	MyDatabaseDetails dbDetails = new MyDatabaseDetails();
    	dbDetails.setUrl(env.getProperty("dburl"));
    	dbDetails.setUsername(env.getProperty("dbusername"));
    	dbDetails.setPassword(env.getProperty("dbpwd"));
    	dbDetails.setMyArray(env.getProperty("arrayOfStrings", List.class));
    	
    	return dbDetails;
    }
    
    
}
