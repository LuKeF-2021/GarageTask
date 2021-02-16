package com.qa.garagetask;

public class Vehicle {
	
	private String typeOfVehicle;
	private float vehicleWeight;
	private String fuelType;
	private float vehiclePrice;
	private int yearMade;
	private int passengerLimit;
	private int vehicleID;
	private float fixCost = 0;
	
	
	
	
	public float getFixCost() {
		return fixCost;
	}
	public void setFixCost(float fixCost) {
		this.fixCost = fixCost;
	}
	public String getTypeOfVehicle() {
		return typeOfVehicle;
	}
	public void setTypeOfVehicle(String typeOfVehicle) {
		this.typeOfVehicle = typeOfVehicle;
	}
	public int getVehicleID() {
		return vehicleID;
	}
	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}
	public int getPassengerLimit() {
		return passengerLimit;
	}
	public void setPassengerLimit(int passengerLimit) {
		this.passengerLimit = passengerLimit;
	}
	public float getVehicleWeight() {
		return vehicleWeight;
	}
	public void setVehicleWeight(float vehicleWeight) {
		this.vehicleWeight = vehicleWeight;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public float getVehiclePrice() {
		return vehiclePrice;
	}
	public void setVehiclePrice(float vehiclePrice) {
		this.vehiclePrice = vehiclePrice;
	}
	public int getYearMade() {
		return yearMade;
	}
	public void setYearMade(int yearMade) {
		this.yearMade = yearMade;
	}
	
	

}
