package edu.mu.vehicleManager;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import edu.mu.vehicle.*;

public class VehicleManager {
	
	private ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
	private String vehicleFilePath = "vehicleList.csv";
	
	public boolean initalizeStock() {
		//needs to be completed 
		
		return false;
	}
	
	public void displayAllCarInformation() {
	
		
		for (Vehicle vehicle : vehicleList) {
			if ( vehicle instanceof Car) {
		
				System.out.println(vehicle.toString());
				return;
			}
			System.out.println(" No car in inventory ");
		}
		
	}
	
	public void displayAllTruckInformation() {
		for (Vehicle vehicle : vehicleList) {
			if ( vehicle instanceof Truck) {
		
				System.out.println(vehicle.toString());
				return;
			}
			System.out.println(" No Truck in inventory ");
		}
				
	}
	
	public void displayAllSUVInformation() {
		for (Vehicle vehicle : vehicleList) {
			if ( vehicle instanceof SUV) {
		
				System.out.println(vehicle.toString());
				return;
			}
			System.out.println(" No SUV in inventory ");
		}
		
	}
	
	public void displayAllMotorBikeInformation() {
		
		for (Vehicle vehicle : vehicleList) {
			if ( vehicle instanceof MotorBike) {
		
				System.out.println(vehicle.toString());
				return;
			}
			System.out.println(" No MotorBike in inventory ");
		}
	}
	
	public void displayVehicleInformation(Vehicle v) {
		for (Vehicle vehicle: vehicleList ) {
			if (vehicle.equals(v)) {
				
				System.out.println(vehicle.toString());
				return;
			}
		}
		System.out.println("Vehicle is not in inventory");
	}
	
	public void displayAllVehicleInformation() {
		for ( Vehicle vehicle: vehicleList ) {
		
			System.out.println(vehicle.toString());//
			return;
			}
		
		System.out.println("no vehicle in inventory");
	}
	
	public boolean removeVehicle(Vehicle vehicle) {
		 
		
		return false;
	}
	
	public boolean addVehicle(Vehicle vehicle) {
		//needs to be completed
		
		return false;
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
		} catch(FileNotFoundException e) {
			System.out.println("File \"" + vehicleFilePath + "\" could not be found");
		} catch(IOException e) {
			System.out.println("Cannot write to file!\n" + e);
		}
		return false;
	}
	
	private boolean isVehicleType(Vehicle v, Class clazz) {
		//needs to be completed
		
		return false;
	}
	public int getNumberOfVehiclesByType(Class clazz) {
		//needs to be completed
		
		return 0;
	}
	
	public Vehicle getVehicleWithHighestMaintenanceCost(double distance) {
		
	}
	
	public ArrayList<Vehicle>getVehicleWithHighestFuelEfficiency(double distance, double fuelPrice) {
		
	}
	
	public ArrayList<Vehicle>getVehicleWithLowestFuelEfficiency(double distance, double fuelPrice) {
		
	}
	
	public double getAverageFuelEfficiencyOfSUVs(double distance, double fuelPrice) {
		//needs to be completed
		
		return 0.0;
	}
}
