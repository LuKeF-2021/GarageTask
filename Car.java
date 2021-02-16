package com.qa.garagetask;

public class Car extends Vehicle {

	private int engineHorsePower;

	public int getEngineHorsePower() {
		return engineHorsePower;
	}

	public void setEngineHorsePower(int engineHorsePower) {
		this.engineHorsePower = engineHorsePower;
	}
	
	@Override
	public String toString() {
		
		String carString = "";
		carString += this.getTypeOfVehicle() + ", ";
		carString += this.getEngineHorsePower() + "HP" + ", ";
		carString += this.getFuelType() + ", ";
		carString += this.getPassengerLimit() + ", ";
		carString += "#" + this.getVehicleID() + ", ";
		carString += "£" + this.getVehiclePrice() + ", ";
		carString += this.getVehicleWeight() + "kg" + ", ";
		carString += this.getYearMade() + ", ";
		carString += "£" + this.getFixCost();
		
		return carString;
	}
	
}
