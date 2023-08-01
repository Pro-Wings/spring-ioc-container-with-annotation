package com.prowings.propertyconfig;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//@Component
//@PropertySource("classpath:db.properties")
public class MyDatabaseDetails {
	
//	@Value("${dbusername}")
	String username;
	
//	@Value("${dburl}")
	String url;
	
//	@Value("${dbpwd}")
	String password;
	
//	@Value("${arrayOfStrings}")
	List<String> myArray;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<String> getMyArray() {
		return myArray;
	}
	public void setMyArray(List<String> myArray) {
		this.myArray = myArray;
	}
	@Override
	public String toString() {
		return "MyDatabaseDetails [username=" + username + ", url=" + url + ", password=" + password + ", myArray="
				+ myArray + "]";
	}

	
	
	
	
}
