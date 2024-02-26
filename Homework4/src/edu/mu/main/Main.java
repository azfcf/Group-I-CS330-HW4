package edu.mu.main;

import edu.mu.vehicleManager.VehicleManager;

public class Main {
	public static void main(String args[]) {
		// Instantiate vehicleManager, perform operations based on the requirements.
		VehicleManager vehicleManager = new VehicleManager();
		
		// Read vehicle data from the vehicleList.csv file and initialize objects.
		
		/*
		 *  The instructions say to read the list during object initialization.
		 *  Therefore this isn't implemented in the Main function to avoid initializing
		 *  the list twice. However, the code for this is implemented below.
		 */
		
//		if (vehicleManager.initalizeStock()) {
//			System.out.println("Stock successfully initialized");
//		} else { 
//			System.out.println("Stock failed to initialize");
//		}
		
		// Display all vehicle information.
		System.out.println("All Vehicle info\n-----------------------------\n");
		vehicleManager.displayAllVehicleInformation();
		
		// Display all car information.
		System.out.println("All car info\n-----------------------------\n");
		vehicleManager.displayAllCarInformation();
		
		// Display all motorbike information.
		System.out.println("All motorbike info\n-----------------------------\n");
		vehicleManager.displayAllMotorBikeInformation();
		
		System.out.println("All truck info\n-----------------------------\n");
		vehicleManager.displayAllTruckInformation();
		
		System.out.println("All SUV info\n-----------------------------\n");
		vehicleManager.displayAllSUVInformation();
		
		/*
		 * Below are some testing statements
		 */
		
//		// Testing getNumberOfVehiclesByType()
//		System.out.println(vehicleManager.getNumberOfVehiclesByType(edu.mu.vehicle.Car.class));
//		
//		// Testing getVehicleWithHighestMaintenanceCost
//		System.out.println(vehicleManager.getVehicleWithHighestMaintenanceCost(300)); //temp values 
//		
//		// Testing getVehicleWithLowestMaintenanceCost
//		System.out.println(vehicleManager.getVehicleWithLowestMaintenanceCost(300)); //temp values 
//		
//		System.out.println("\nhighest fuel efficiency");
//		
//		System.out.println(vehicleManager.getVehicleWithHighestFuelEfficiency(300, 3.25));
//		
//		System.out.println("\nlowest efficiency");
//		System.out.println(vehicleManager.getVehicleWithLowestFuelEfficiency(300, 3.25));
//		
//		// Testing average
//		System.out.println(vehicleManager.getAverageFuelEfficiencyOfSUVs(300, 3.25));
//		
//		// Testing removing vehicles
//		if (vehicleManager.getVehicleList().size() != 0) {
//			Vehicle vehicleToRemove = vehicleManager.getVehicleList().get(0);
//			
//			vehicleManager.displayVehicleInformation(vehicleToRemove);
//			if (vehicleManager.removeVehicle(vehicleToRemove)) {
//				System.out.println("removed vehicle");
//			} else {
//				System.out.println("removing failed");
//			}
//		}
//		// Testing adding vehicles
//		Vehicle vehicleToAdd = new Car("BMW", "M3", 2024, 78500.12, VehicleColor.BLACK, FuelType.GASOLINE, 9999, 3200, 6, 15, StartMechanism.PUSHSTART);
//		if (vehicleManager.addVehicle(vehicleToAdd)) {
//			System.out.println("Added vehicle");
//			vehicleManager.displayVehicleInformation(vehicleToAdd);
//		} else {
//			System.out.println("adding vehicle failed");
//		}
//		
//		
//		vehicleManager.saveVehicleList();
//		// Testing isVehicleType
//		
	}
}

