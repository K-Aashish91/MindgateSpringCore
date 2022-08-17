package com.mindgate.pojo;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private int assressId; //its addressId
	private String houseNumber;
	private String buildingName;
	private String street;
	private String city;
	private String pin;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(int assressId, String houseNumber, String buildingName, String street, String city, String pin) {
		super();
		this.assressId = assressId;
		this.houseNumber = houseNumber;
		this.buildingName = buildingName;
		this.street = street;
		this.city = city;
		this.pin = pin;
	}
	
	public int getAssressId() {
		return assressId;
	}

	public void setAssressId(int assressId) {
		this.assressId = assressId;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [assressId=" + assressId + ", houseNumber=" + houseNumber + ", buildingName=" + buildingName
				+ ", street=" + street + ", city=" + city + ", pin=" + pin + "]";
	}
	
}
