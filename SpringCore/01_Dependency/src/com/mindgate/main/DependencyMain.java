package com.mindgate.main;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

public class DependencyMain {

public static void main(String[] args) {
	System.out.println("Main Start");
//	System.out.println("Creating the Address Object and Set methods");
//	Address address = new Address();
//	address.setAssressId(10);
//	address.setHouseNumber("19A");
//	address.setBuildingName("Rakshak Society");
//	address.setStreet("25B");
//	address.setCity("Nagpur");
//	address.setPin("123124");
//	
//	System.out.println(address);
//	
//	System.out.println();
//	
//	System.out.println("Creating the Employee Object and Set methods");
//	
//	Employee employee = new Employee();
//	employee.setEmployeeId(109);
//	employee.setName("AK");
//	employee.setSalary(9132332);
//	employee.setHomeAddress(address);
//	
//	
//	System.out.println(employee);

	Address address = new Address(21, "12A", "Take Care Society", "237H", "Calcutta", "123353");
	
	Employee employee = new Employee(121, "Ashu K", 9123767, address);
	
	System.out.println(employee);
	
	System.out.println("Main Ends");
}
}
