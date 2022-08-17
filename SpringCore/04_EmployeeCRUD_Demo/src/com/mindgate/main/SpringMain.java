package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

public class SpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Start");
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		
		
		EmployeeServiceInterface employeeServiceInterface = applicationContext.getBean("employeeService", EmployeeServiceInterface.class);
		
		employeeServiceInterface.addEmployee();
		
		
		System.out.println("Main Ends");
	}

}
