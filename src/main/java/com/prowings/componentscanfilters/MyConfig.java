package com.prowings.componentscanfilters;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.prowings.package1.BeanC;
import com.prowings.package1.ParentBean;

@Configuration
@ComponentScan(basePackages = "com.prowings.package1", excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = ParentBean.class))
//@ComponentScan(basePackages = "com.prowings.package1")
public class MyConfig {

}
