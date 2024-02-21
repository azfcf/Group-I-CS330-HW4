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
		//needs to be completed
	}
	
	public void displayAllTruckInformation() {
		//needs to be completed
		
	}
	
	public void displayAllSUVInformation() {
		
	}
	
	public void displayAllMotorBikeInformation() {
		
	}
	
	public void displayVehicleInformation(Vehicle v) {
		
	}
	
	public void displayAllVehicleInformation() {
		
	}
	
	public boolean removeVehicle(Vehicle vehicle) {
		//needs to be completed 
		
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
