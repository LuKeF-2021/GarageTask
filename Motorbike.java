package com.qa.garagetask;

public class Motorbike extends Vehicle {

	private int ccPower;

	public int getCcPower() {
		return ccPower;
	}

	public void setCcPower(int ccPower) {
		this.ccPower = ccPower;
	}
	
	@Override
	public String toString() {
		
		String motorbikeString = "";
		motorbikeString += this.getTypeOfVehicle() + ", ";
		motorbikeString += this.getCcPower() + "CC" + ", ";
		motorbikeString += this.getFuelType() + ", ";
		motorbikeString += this.getPassengerLimit() + ", ";
		motorbikeString += "#" + this.getVehicleID() + ", ";
		motorbikeString += "£" + this.getVehiclePrice() + ", ";
		motorbikeString += this.getVehicleWeight() + "kg" + ", ";
		motorbikeString += this.getYearMade() + ", ";
		motorbikeString += "£" + this.getFixCost();
		
		return motorbikeString;
	}
	
}
