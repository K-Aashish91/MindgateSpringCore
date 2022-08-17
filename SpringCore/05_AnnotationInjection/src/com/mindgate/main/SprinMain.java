package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

public class SprinMain {

	public static void main(String[] args) {
		System.out.println("Main Starts ");
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("applicationContext is created");
		
		Address address = applicationContext.getBean("address", Address.class);
		
		System.out.println(address);
		
		System.out.println();
		
		System.out.println("Main Ends");
		
		

	}

}
