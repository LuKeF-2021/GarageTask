package com.qa.garagetask;

public class runner {

	public static void main(String[] args) {
		
		Garage g = new Garage();
		g.addCar(400, "Diesel", 5, 9799.99f, 1250f, 2018);
		g.addCar(600, "Petrol", 5, 7799.99f, 1150f, 2019);
		g.addCar(550, "Diesel", 5, 26699.99f, 1300f, 2011);
		g.addMotorbike(150, "Petrol", 1, 4499.99f, 120f, 2016);
		g.addBus("Single", "Diesel", 80, 25000f, 20000f, 2011);
		g.DisplayVehicles();
		System.out.println("--------------------------------------------------");
//		g.DeleteVehicleByID(2);
//		g.DeleteVehicleByType("car");
//		g.EmptyGarage();
		g.CalculateFixCost();
		g.DisplayVehicles();
		
	}

}
