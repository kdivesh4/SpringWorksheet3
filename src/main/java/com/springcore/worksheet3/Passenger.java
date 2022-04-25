package com.springcore.worksheet3;

public class Passenger {
	
	private String name;
	private int Age;
	private long phoneNumber;
	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "\n Passenger [\n name=" + name + ",\n Age=" + Age + ",\n phoneNumber=" + phoneNumber + ",\n address=" + address
				+ "] \n";
	}
	
	
}
