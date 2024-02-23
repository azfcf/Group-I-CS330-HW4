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
		 *  the list twice.
		 */
		
		// Display all vehicle information.
		vehicleManager.displayAllVehicleInformation();
		
		// Display all car information.
		vehicleManager.displayAllCarInformation();
		
		// Display all motorbike information.
		vehicleManager.displayAllMotorBikeInformation();
	}
}

