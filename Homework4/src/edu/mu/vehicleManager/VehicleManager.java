package edu.mu.vehicleManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
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
	/*
	private boolean isVehicleType(Vehicle v, Class clazz) {
		//needs to be completed
		
		return false;
	}
	*/
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
