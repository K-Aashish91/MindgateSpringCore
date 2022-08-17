package com.mindgate.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Address {
	private String Address1;
	private String Address2;
	private String Address3;
	
	public Address() {
		System.out.println("Default constructor of Address class");
	}

	public Address(String address1, String address2, String address3) {
		super();
		Address1 = address1;
		Address2 = address2;
		Address3 = address3;
	}

	public String getAddress1() {
		return Address1;
	}

	public void setAddress1(String address1) {
		Address1 = address1;
	}

	public String getAddress2() {
		return Address2;
	}

	public void setAddress2(String address2) {
		Address2 = address2;
	}

	public String getAddress3() {
		return Address3;
	}

	public void setAddress3(String address3) {
		Address3 = address3;
	}

	@Override
	public String toString() {
		return "Address [Address1=" + Address1 + ", Address2=" + Address2 + ", Address3=" + Address3 + "]";
	}
	
	

}
