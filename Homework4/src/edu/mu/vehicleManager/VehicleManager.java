package edu.mu.vehicleManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Random;

import edu.mu.vehicle.*;

public class VehicleManager {
	
	private ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>(); // Vehicle inventory ArrayList
	private static final String vehicleFilePath = "vehicleList.csv";  // CSV file path
	
	// Variables for calculating maintenance cost and fuel efficiency
	private static final double distance = 300;
	private static final double fuelPrice = 3.25;

	// Returns a copy of the inventory
	public ArrayList<Vehicle> getVehicleList() {
		return new ArrayList<Vehicle>(vehicleList);
	}
	
	/*
	 * Alternate constructor - this is for if initializeStock() should be called after the VehicleManager is initialized.
	 */
	
//	public VehicleManager() {
//	}
	
	// Object constructor
	public VehicleManager() { 
		initalizeStock(); // Parse the stock CSV file into inventory during object initialization
	}
	
	/*
	 * This method reads the CSV file located at vehicleFilePath and attempts to convert the
	 * lines of the CSV into Vehicle objects.
	 */
	public boolean initalizeStock() {
		File file = new File(vehicleFilePath); // Get the CSV file
		try {
			Scanner fileScanner = new Scanner(file); // Initialize scanner object
			fileScanner.nextLine(); // Skip the header line
			
			// Iterate through the lines of the file until there are no more lines left
			while(fileScanner.hasNext()) {
				// Read each line in the file and try to create a Vehicle object from the data
				String vehicle = fileScanner.nextLine();
				// Split each line into data to be parsed
				String[] splitVehicle = vehicle.split(",");
				
				/*
				 * Read the data from the line and parse it into the required attributes for Vehicle object
				 * The data should be formatted as follows:
				 * vehicleType,brand,make,modelYear,price,color,fuelType,mileage,mass,cylinders,gasTankCapacity,startMechanism
				 */
				String brand = splitVehicle[1]; // brand
				String make = splitVehicle[2]; // make
				long modelYear = Long.parseLong(splitVehicle[3]); // modelYear
				double price = Double.parseDouble(splitVehicle[4]); // price
				VehicleColor color = VehicleColor.valueOf(splitVehicle[5]); // color
				FuelType fueltype = FuelType.valueOf(splitVehicle[6]); // fuel type
				double mileage = Double.parseDouble(splitVehicle[7]); // mileage
				double mass = Double.parseDouble(splitVehicle[8]); // mass
				int cylinders = Integer.parseInt(splitVehicle[9]); // int
				double gasTankCapacity = Double.parseDouble(splitVehicle[10]); // gas tank capacity
				StartMechanism startMechanism = StartMechanism.valueOf(splitVehicle[11]); // start mechanism
				
				/*
				 * Parse the 1st column to determine the vehicle type. If it matches a known vehicle type,
				 * create the corresponding object using the rest of the data from the line.
				 * If it does not match, then ignore it.
				 */
				if(splitVehicle[0].equals("Truck")){ // Create a Truck object
					Truck truck = new Truck(brand, make, modelYear, price, color, fueltype, mileage, mass, cylinders, gasTankCapacity, startMechanism);
					vehicleList.add(truck);
				}
				else if(splitVehicle[0].equals("SUV")) { // Create an SUV object
					SUV suv = new SUV(brand, make, modelYear, price, color, fueltype, mileage, mass, cylinders, gasTankCapacity, startMechanism);
					vehicleList.add(suv);
				}
				else if(splitVehicle[0].equals("Car")) { // Create a Car object
					Car car = new Car(brand, make, modelYear, price, color, fueltype, mileage, mass, cylinders, gasTankCapacity, startMechanism);
					vehicleList.add(car);
				}
				else if(splitVehicle[0].equals("MotorBike")){ // Create a MotorBike object
					MotorBike bike = new MotorBike(brand, make, modelYear, price, color, fueltype, mileage, mass, cylinders, gasTankCapacity, startMechanism);
					vehicleList.add(bike);
				}
				else { // Vehicle type not recognized
					System.out.println(splitVehicle[0] + "is not a recognized vehicle type. Skipping this entry.");
				}
			}
			fileScanner.close(); // Close the scanner
			return true;
		} catch (FileNotFoundException e) { // Catch for if file is not found
			e.printStackTrace();
		} catch (NoSuchElementException e) { // Catch if scanner tries to move to next line when there is none
			System.out.println("File is formatted incorrectly or empty.");
			e.printStackTrace();
		}
		return false;
	}
	
	// Display all of the information for Car objects
	public void displayAllCarInformation() {
		boolean carExistsInList = false;
		
		// Iterate through the entire inventory and search for Car objects
		for (Vehicle vehicle : vehicleList) {
			if (vehicle instanceof Car) {
				// Displays all attributes of Vehicle class as well as maintenance cost, fuel efficiency, and start type
				vehicle.displayAllInfo(distance, fuelPrice);
				carExistsInList = true;
			}
		}
		
		// If no Cars exist in the inventory, display a message
		if (!carExistsInList) {
			System.out.println("No cars in inventory.");
		}
	}
	
	// Display all of the information for Truck objects
	public void displayAllTruckInformation() {
		boolean truckExistsInList = false;
		
		// Iterate through the entire inventory and search for Truck objects
		for (Vehicle vehicle : vehicleList) {
			if (vehicle instanceof Truck) {
				// Displays all attributes of Vehicle class as well as maintenance cost, fuel efficiency, and start type
				vehicle.displayAllInfo(distance, fuelPrice);
				truckExistsInList = true;
			}
		}
		
		//If no Trucks exist in inventory, display a message
		if (!truckExistsInList) {
			System.out.println("No trucks in inventory.");
		}
	}
	
	// Displays all of the information for SUV objects
	public void displayAllSUVInformation() {
		boolean suvExistsInList = false;
		
		// Iterate through the entire inventory and search for SUV objects
		for (Vehicle vehicle : vehicleList) {
			if (vehicle instanceof SUV) {
				// Displays all attributes of Vehicle class as well as maintenance cost, fuel efficiency, and start type
				vehicle.displayAllInfo(distance, fuelPrice);
				suvExistsInList = true;
			}
		}
		
		//If no SUVs exist in inventory, display a message
		if (!suvExistsInList) {
			System.out.println("No SUVs in inventory.");
		}
	}
	
	// Displays all of the information for MotorBike objects
	public void displayAllMotorBikeInformation() {
		boolean motorBikeExistsInList = false;
		
		// Iterate through the entire inventory and search for MotorBike objects
		for (Vehicle vehicle : vehicleList) {
			if ( vehicle instanceof MotorBike) {
				// Displays all attributes of Vehicle class as well as maintenance cost, fuel efficiency, and start type
				vehicle.displayAllInfo(distance, fuelPrice);
				motorBikeExistsInList = true;
			}
		}
		
		//If no MotorBikes exist in inventory, display a message
		if (!motorBikeExistsInList) {
			System.out.println("No motor bikes in inventory.");
		}
	}
	
	// Displays the information of a given Vehicle in the inventory
	public void displayVehicleInformation(Vehicle v) {
		for (Vehicle vehicle: vehicleList ) {
			if (vehicle.equals(v)) {
				vehicle.displayAllInfo(distance, fuelPrice);
				return;
			}
		}
		System.out.println("Vehicle is not in inventory."); // Message if v is not found in the inventory
	}
	
	// Displays the details of every vehicle in inventory
	public void displayAllVehicleInformation() {
		// Iterate through the entire inventory and display the vehicle details
		for ( Vehicle vehicle: vehicleList ) {
			vehicle.displayAllInfo(distance, fuelPrice);
		}
		
		// If the inventory is empty, display a message
		if (vehicleList.size() == 0) {
			System.out.println("No vehicles in inventory.");
		}
	}
	
	public boolean removeVehicle(Vehicle vehicle) {
		if (vehicleList.contains(vehicle)) { //Check if vehicleList contains the specific vehicle
			vehicleList.remove(vehicle); //If it is found, remove it
			return true;
		} else { //It if is not found, return false
			return false;
		}
	}
	
	public boolean addVehicle(Vehicle vehicle) {
		if (!vehicleList.contains(vehicle)) { //Check if vehicleList does not contain the specific vehicle
			vehicleList.add(vehicle); //If it is not found, add it
			return true;
		} else {
			return false; //If it is found, return false
		}
	}
	
	public boolean saveVehicleList() {
		// Look for the file specified and open it
		try(FileWriter writer = new FileWriter(vehicleFilePath)){

			// Write the CSV header
			String header = "Type,Model,Make,ModelYear,Price,Color,FuelType,Mileage,Mass,Cylinders,GasTankCapacity,StartType\n";
			writer.write(header);
			
			// Write the details of all products in the inventory to file
			for(Vehicle vehicle : vehicleList) {
				writer.write(vehicle.toCSVRow() + "\n");
			}
			return true; // File writer closes automatically due to try-with-resource block 
		} catch(FileNotFoundException e) { // Catch if file is not found
			System.out.println("File \"" + vehicleFilePath + "\" could not be found");
		} catch(IOException e) { // Catch any other errors that might occur
			System.out.println("Cannot write to file!");
			e.printStackTrace();
		}
		return false;
	}
	
	// Checks if a given vehicle is a specified class
	private boolean isVehicleType(Vehicle v, Class clazz) {
		if (v.getClass() == clazz) { // If vehicle class is equal to clazz, then return true
			return true;
		} else { // Return false otherwise
			return false;
		}
	}
	
	public int getNumberOfVehiclesByType(Class clazz) {
		int count = 0; //counter
		for (Vehicle vehicle : vehicleList) { //iterate through each vehicle
			if (clazz.isInstance(vehicle)) { //check if current vehicle is an instance of the specific type
				count++; //If so, increment the counter
			}
		}
		return count; //return total count
	}
	
	public Vehicle getVehicleWithHighestMaintenanceCost(double distance) {
		Vehicle vehicleWithHighestCost = null; //Variable to keep track of the vehicles with highest cost
		double highestCost = Double.MIN_VALUE; //Variable to keep track of highest cost itself
		int count = 0; //Counter for vehicles with the same highest cost
		
		for (Vehicle vehicle : vehicleList) { //Iterate through each vehicle in vehicleList
			double maintenanceCost = vehicle.calculateMaintenanceCost(distance); //Calculate cost for the specified vehicle
			
			if (maintenanceCost > highestCost) { //Update highestCost and vehicleWithHighestCost while also resetting count if a new highest is found
				highestCost = maintenanceCost;
				vehicleWithHighestCost = vehicle;
				count = 1;
			} else if (maintenanceCost == highestCost) {
				count++; //Increment count for vehicles with the same highest count
				Random random = new Random(); //Randomly select only one =of the vehicles with the same highest count
				if (random.nextInt(count) == 0) {
					vehicleWithHighestCost = vehicle;
				}
			}
		}
		return vehicleWithHighestCost; //Return vehicle with the highest maintenance cost
	}
	
	public Vehicle getVehicleWithLowestMaintenanceCost(double distance) {
		Vehicle vehicleWithLowestCost = null; //Variable to keep track of the vehicles with lowest cost
		double lowestCost = Double.MAX_VALUE; //Variable to keep track of lowest cost itself
		int count = 0; //Counter for vehicles with same lowest cost
		
		for (Vehicle vehicle : vehicleList) { //Iterate through each vehicle in vehicleList
			double maintenanceCost = vehicle.calculateMaintenanceCost(distance); //Calculate cost for the specified vehicle
			
			if (maintenanceCost < lowestCost) { //Update lowestCost and vehicleWithLowestCost while also resetting count if a new lowest is found
				lowestCost = maintenanceCost;
				vehicleWithLowestCost = vehicle;
				count = 1;
			} else if (maintenanceCost == lowestCost) { 
				count++; //Increment count for vehicles with same lowest cost
				Random random = new Random(); //Randomly select only one of the vehicles with the same lowest count
				if (random.nextInt(count) == 0) {
					vehicleWithLowestCost = vehicle;
				}
			}
		}
		return vehicleWithLowestCost; //Return vehicle with the lowest maintenance cost
	}
	
	
	public ArrayList<Vehicle>getVehicleWithHighestFuelEfficiency(double distance, double fuelPrice) {
		
		ArrayList<Vehicle> vehiclesWithLowestEfficiency = new ArrayList<Vehicle>(); //List to keep track of the vehicles with the lowest efficiency
		double lowestEfficiency = Double.MAX_VALUE; //Variable to keep track of lowest efficiency itself
		
		for (Vehicle vehicle : vehicleList)  {//Iterate through each vehicle in vehicleList
			double efficiency = vehicle.calculateFuelEfficiency(distance, fuelPrice); //Calculate fuel efficiency for the specified vehicle
			
			if (efficiency < lowestEfficiency) { //Clear the list of vehicles and update the list with the new lowest efficiency if the current vehicle's efficiency is lower than the previous
				lowestEfficiency = efficiency;
				vehiclesWithLowestEfficiency.clear();
				vehiclesWithLowestEfficiency.add(vehicle);
			} else if (efficiency == lowestEfficiency) { //If the current vehicle's efficiency matches the lowest found so far, add it to the list
				vehiclesWithLowestEfficiency.add(vehicle);
			}
		}
		
		return vehiclesWithLowestEfficiency; //Return list of vehicles with the lowest fuel efficiency
	}
	
	public ArrayList<Vehicle>getVehicleWithLowestFuelEfficiency(double distance, double fuelPrice) {
		
		ArrayList<Vehicle> vehiclesWithHighestEfficiency = new ArrayList<Vehicle>(); //List to keep track of the vehicles with the highest efficiency
		double highestEfficiency = Double.MIN_VALUE; //Variable to keep track of highest efficiency itself
		
		for (Vehicle vehicle : vehicleList) { //Iterate through each vehicle in vehicleList
			double efficiency = vehicle.calculateFuelEfficiency(distance, fuelPrice); //Calculate fuel efficiency for the specified vehicle
			
			if (efficiency > highestEfficiency) { //Clear the list of vehicles and update the list with the new highest efficiency if the current vehicle's efficiency is higher than the previous
				highestEfficiency = efficiency;
				vehiclesWithHighestEfficiency.clear();
				vehiclesWithHighestEfficiency.add(vehicle);
			} else if (efficiency == highestEfficiency) { //If the current vehicle's efficiency matches the highest found so far, add it to the list
				vehiclesWithHighestEfficiency.add(vehicle);
			}
		}
		
		return vehiclesWithHighestEfficiency; //Return list of vehicles with the highest fuel efficiency
	}
	
	public double getAverageFuelEfficiencyOfSUVs(double distance, double fuelPrice) {
		
		double totalEfficiency = 0.0; //Variable to keep track of total fuel efficiency
		int suvCount = 0; //Variable to keep track of the count of SUVs
		
		for (Vehicle vehicle : vehicleList) { //Iterate through each vehicle in vehicleList
			if (isVehicleType(vehicle, SUV.class)) { //Check if the vehicle is an instance of SUV
				double efficiency = vehicle.calculateFuelEfficiency(distance, fuelPrice); //Calculate fuel efficiency for the SUV
				
				totalEfficiency += efficiency; //Add efficiency to the total
				suvCount++; //Increment the count of SUVs
			}
		}
		
		if (suvCount == 0) { //Check if there are any SUVs in the list
			return -1.0; //If there is none then return -1.0 as an error code
		} else {
			double averageEfficiency = totalEfficiency / suvCount; //If there is the calculate and return the average fuel efficiency
			return averageEfficiency;
		}
	}
}
