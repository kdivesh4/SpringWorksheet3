package com.springcore.worksheet3;

import java.util.List;

public class Train {

	private String name;
	private long pnrNumber;
	private String sourceStation;
	private String destinationStation;
	private List<Passenger> passengerList;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPnrNumber() {
		return pnrNumber;
	}
	public void setPnrNumber(long pnrNumber) {
		this.pnrNumber = pnrNumber;
	}
	public String getSourceStation() {
		return sourceStation;
	}
	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}
	public String getDestinationStation() {
		return destinationStation;
	}
	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}
	public List<Passenger> getPassengerList() {
		return passengerList;
	}
	public void setPassengerList(List<Passenger> passengerList) {
		this.passengerList = passengerList;
	}
	
	@Override
	public String toString() {
		return "Train [\n name=" + name + ",\n pnrNumber=" + pnrNumber + ",\n sourceStation=" + sourceStation
				+ ",\n destinationStation=" + destinationStation + ",\n passengerList=" + passengerList + "] \n";
	}
	
	
 }
