package com.springcore.worksheet3;

public class Address {
	
	private int streetNumber;
	private String city;
	private int pincode;
	private String landmark;
	
	public int getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	
	@Override
	public String toString() {
		return "\n Address [streetNumber=" + streetNumber + ", city=" + city + ", pincode=" + pincode + ", landmark="
				+ landmark + "] \n";
	}
	
		
}
