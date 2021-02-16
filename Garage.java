package com.qa.garagetask;

import java.util.ArrayList;

public class Garage {

	Vehicle vehicle = new Vehicle();
	ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	private int numOfVehcilesInGarage = 0;

	public void addCar(int HP, String fuelType, int passengerLimit, float price, float weight, int yearMade) {

		Car car = new Car();
		car.setTypeOfVehicle("car");
		car.setEngineHorsePower(HP);
		car.setFuelType(fuelType.toLowerCase());
		car.setPassengerLimit(passengerLimit);
		car.setVehicleID(numOfVehcilesInGarage + 1);
		car.setVehiclePrice(price);
		car.setVehicleWeight(weight);
		car.setYearMade(yearMade);
		vehicles.add(car);
		numOfVehcilesInGarage++;
		
		
	}

	public void addMotorbike(int CC, String fuelType, int passengerLimit, float price, float weight, int yearMade) {

		Motorbike motorbike = new Motorbike();
		motorbike.setTypeOfVehicle("motorbike");
		motorbike.setCcPower(CC);
		motorbike.setFuelType(fuelType.toLowerCase());
		motorbike.setPassengerLimit(passengerLimit);
		motorbike.setVehicleID(numOfVehcilesInGarage + 1);
		motorbike.setVehiclePrice(price);
		motorbike.setVehicleWeight(weight);
		motorbike.setYearMade(yearMade);
		vehicles.add(motorbike);
		numOfVehcilesInGarage++;
		
	}

	public void addBus(String SoD, String fuelType, int passengerLimit, float price, float weight, int yearMade) {

		Bus bus = new Bus();
		bus.setTypeOfVehicle("bus");
		bus.setSingleOrDoubleDecker(SoD);
		bus.setFuelType(fuelType);
		bus.setPassengerLimit(passengerLimit);
		bus.setVehicleID(numOfVehcilesInGarage + 1);
		bus.setVehiclePrice(price);
		bus.setVehicleWeight(weight);
		bus.setYearMade(yearMade);
		vehicles.add(bus);
		numOfVehcilesInGarage++;

	}

	public void DisplayVehicles() {

		for(Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
		}
		
	}

	public void DeleteVehicleByID(int ID) {
		
		for(int i = 0; i <= (vehicles.size()) - 1;i++) {
			Vehicle temp = new Vehicle();
			temp = vehicles.get(i);
			if((temp.getVehicleID() == ID)){
				vehicles.remove(i);
			}
		}

	}
	
	public void DeleteVehicleByType(String vehicleType) {
		int numberDeleted = 0;
		vehicleType = vehicleType.toLowerCase();
				
		for(int i = 0; i <= (vehicles.size()) - 1;i++) {
			Vehicle temp = new Vehicle();
			temp = vehicles.get(i-numberDeleted);
			if((temp.getTypeOfVehicle() == vehicleType)){
				vehicles.remove(i-numberDeleted);
				numberDeleted++;
			}
		}
		
	}

	public void CalculateFixCost() {

		for(int i = 0; i <= (vehicles.size()) - 1;i++) {
			Vehicle temp = new Vehicle();
			temp = vehicles.get(i);
			if((temp.getTypeOfVehicle()) == "car"){
				Car tempCar = new Car();
				temp.setFixCost(((temp.getVehiclePrice())/5) + (tempCar.getEngineHorsePower()));
			}else if((temp.getTypeOfVehicle()) == "motorbike"){
				Motorbike tempBike = new Motorbike();
				temp.setFixCost(((temp.getVehiclePrice())/6) + (tempBike.getCcPower()));
			}else if((temp.getTypeOfVehicle()) == "bus"){
				temp.setFixCost(((temp.getVehiclePrice())/9));
			}
		}

		
	}

	public void EmptyGarage() {
		
		vehicles.clear();
	}

}
