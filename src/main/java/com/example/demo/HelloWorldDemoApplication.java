package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.component.DemoBean;
import com.example.demo.component.EmployeeBean;


@SpringBootApplication
public class HelloWorldDemoApplication {
	public static Logger logger = LoggerFactory.getLogger(HelloWorldDemoApplication.class);
	public static void main(String[] args) {
		System.out.println("hii");
		ApplicationContext context = SpringApplication.run(HelloWorldDemoApplication.class, args);
		
		DemoBean demoBean = context.getBean(DemoBean.class);
		logger.debug(demoBean.toString());
		logger.debug("Hi ssssshruthi");
		
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.setEname("Shruthi");
		employeeBean.setEid(10);
		
		employeeBean.showDetails();
		
	}

}
