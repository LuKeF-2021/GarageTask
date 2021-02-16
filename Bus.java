package com.qa.garagetask;

public class Bus extends Vehicle {

	private String singleOrDoubleDecker;

	public String getSingleOrDoubleDecker() {
		return singleOrDoubleDecker;
	}

	public void setSingleOrDoubleDecker(String singleOrDoubleDecker) {
		this.singleOrDoubleDecker = singleOrDoubleDecker;
	}
	
	@Override
	public String toString() {
		
		String busString = "";
		busString += this.getTypeOfVehicle() + ", ";
		busString += this.getSingleOrDoubleDecker() + " Deck" + ", ";
		busString += this.getFuelType() + ", ";
		busString += this.getPassengerLimit() + ", ";
		busString += "#" + this.getVehicleID() + ", ";
		busString += "£" + this.getVehiclePrice() + ", ";
		busString += this.getVehicleWeight() + "kg" + ", ";
		busString += this.getYearMade() + ", ";
		busString += "£" + this.getFixCost();
		
		return busString;
	}
	
}
