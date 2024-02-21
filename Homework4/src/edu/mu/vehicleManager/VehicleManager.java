package edu.mu.vehicleManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import edu.mu.vehicle.*;

public class VehicleManager {
	
	private ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
	private String vehicleFilePath = "vehicleList.csv";
	
	public boolean initalizeStock() {
		//needs to be completed 
		File file = new File(vehicleFilePath);
		try {
			Scanner fileScanner = new Scanner(file);
			fileScanner.nextLine();
			while(fileScanner.hasNext()) {
				//do something
				String vehicle = fileScanner.nextLine();
				String[] splitVehicle = vehicle.split(",");
				//getting data from split string
				String brand = splitVehicle[1];
				String make = splitVehicle[2];
				long modelYear = Long.parseLong(splitVehicle[3]);
				double price = Double.parseDouble(splitVehicle[4]);
				VehicleColor color = VehicleColor.valueOf(splitVehicle[5]);
				FuelType fueltype = FuelType.valueOf(splitVehicle[6]);
				double mileage = Double.parseDouble(splitVehicle[7]);
				double mass = Double.parseDouble(splitVehicle[8]);
				int cylinders = Integer.parseInt(splitVehicle[9]);
				double gasTankCapacity = Double.parseDouble(splitVehicle[10]);
				StartMechanism startMechanism = StartMechanism.valueOf(splitVehicle[11]);
				
				if(splitVehicle[0].equals("Truck")){
					Truck truck = new Truck(brand, make, modelYear, price, color, fueltype, mileage, mass, cylinders, gasTankCapacity, startMechanism);
					vehicleList.add(truck);
				}
				else if(splitVehicle[0].equals("SUV")) {
					SUV suv = new SUV(brand, make, modelYear, price, color, fueltype, mileage, mass, cylinders, gasTankCapacity, startMechanism);
					vehicleList.add(suv);
				}
				else if(splitVehicle[0].equals("Car")) {
					Car car = new Car(brand, make, modelYear, price, color, fueltype, mileage, mass, cylinders, gasTankCapacity, startMechanism);
					vehicleList.add(car);
				}
				else {
					MotorBike bike = new MotorBike(brand, make, modelYear, price, color, fueltype, mileage, mass, cylinders, gasTankCapacity, startMechanism);
					vehicleList.add(bike);
				}
				
			}
			fileScanner.close();
			System.out.println(vehicleList.toString());
			return true;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
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
		//needs to be completed
		SUV s = new SUV(null);
		return s;
	}
	
	public ArrayList<Vehicle>getVehicleWithHighestFuelEfficiency(double distance, double fuelPrice) {
		//needs to be completed
		
		ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
		
		return vehicleList;
	}
	
	public ArrayList<Vehicle>getVehicleWithLowestFuelEfficiency(double distance, double fuelPrice) {
		ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
		
		return vehicleList;
	}
	
	public double getAverageFuelEfficiencyOfSUVs(double distance, double fuelPrice) {
		//needs to be completed
		
		return 0.0;
	}
}
