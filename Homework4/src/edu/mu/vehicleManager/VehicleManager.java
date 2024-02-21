package edu.mu.vehicleManager;

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
		
			System.out.println(vehicle.toString());
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
		//needs to be completed
		
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
