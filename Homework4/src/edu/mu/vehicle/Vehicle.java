package edu.mu.vehicle;

import java.time.ZonedDateTime;

public abstract class Vehicle {
	protected String brand;
	protected String make;
	protected long modelYear;
	protected double price;
	protected VehicleColor color;
	protected FuelType fuelType;
	protected double mileage;
	protected double mass;
	protected int cylinders;
	protected double gasTankCapacity;
	protected StartMechanism startType;
	
	// Object constructor
	public Vehicle(String brand, String make, long modelYear, double price, VehicleColor color, FuelType fuelType,
			double mileage, double mass, int cylinders, double gasTankCapacity, StartMechanism startType) {
		this.brand = brand;
		this.make = make;
		this.modelYear = modelYear;
		this.price = price;
		this.color = color;
		this.fuelType = fuelType;
		this.mileage = mileage;
		this.mass = mass;
		this.cylinders = cylinders;
		this.gasTankCapacity = gasTankCapacity;
		this.startType = startType;
	}
	
	// Copy constructor
	public Vehicle(Vehicle vehicle) {
		this.brand = vehicle.brand;
		this.make = vehicle.make;
		this.modelYear = vehicle.modelYear;
		this.price = vehicle.price;
		this.color = vehicle.color;
		this.fuelType = vehicle.fuelType;
		this.mileage = vehicle.mileage;
		this.mass = vehicle.mass;
		this.cylinders = vehicle.cylinders;
		this.gasTankCapacity = vehicle.gasTankCapacity;
		this.startType = vehicle.startType;
	}
	
	// Gets the current year for use in maintenance calculation
	protected int getCurrentYear() {
		return ZonedDateTime.now().getYear();
	}
	
	public abstract String toCSVRow(); // Converts the object into a string for writing back to CSV file
	public abstract double calculateMaintenanceCost(double distance); // calculates maintenance cost for a specific vehicle
	public abstract double calculateFuelEfficiency(double distance, double fuelPrice); // calculates the engine efficiency
	public abstract void startEngine(); // prints how the vehicle starts
	
	@Override // toString
	public String toString() {
		return "Vehicle [brand=" + brand + ", make=" + make + ", modelYear=" + modelYear + ", price=" + price
				+ ", color=" + color + ", fuelType=" + fuelType + ", mileage=" + mileage + ", mass=" + mass
				+ ", cylinders=" + cylinders + ", gasTankCapacity=" + gasTankCapacity + ", startType=" + startType
				+ "]";
	}
	
	/*
	 * Prints all of the vehicle information in a more human-readable format. Includes the maintenance cost,
	 * fuel efficiency, and start type.
	 * 
	 * Template:
	 * yyyy brand make (Vehicle)
	 * ----------------------
	 * Price: price (double)
	 * Color: vehicleColor (VehicleColor)
	 * Fuel type: fuelType (FuelType)
	 * Mileage: mileage (double)
	 * Mass: mass (double)
	 * Cylinders: cylinders (int)
	 * Gas tank capacity: (double)
	 * Start type: startType (StartMechanism)
	 * Maintenance cost: (double)
	 * Fuel efficiency: (double)
	 */
	public void displayAllInfo(double distance, double fuelPrice) {
		System.out.println(
				modelYear + " " +  brand + " " + make + " (" + this.getClass().getSimpleName() + ")\n" + "----------------------" + "\n"
				+ "Price: " + price + "\n"
				+ "Color: " + color + "\n"
				+ "Fuel type: " + fuelType + "\n"
				+ "Mileage:  " + mileage + "\n"
				+ "Mass: " + mass + "\n"
				+ "Cylinders: " + cylinders + "\n"
				+ "Gas tank capacity: " + gasTankCapacity);
		System.out.print("Start type: "); // Print part of the string so we can call the startEngine function to finish it
		startEngine();
		System.out.println("Maintenance cost: " + calculateMaintenanceCost(distance) + "\n"
				+ "Fuel efficiency: " + calculateFuelEfficiency(distance, fuelPrice) + "\n");
				
	}
	
	// Get the brand
	public String getBrand() {
		return brand;
	}

	// Set the brand
	public void setBrand(String brand) {
		this.brand = brand;
	}

	// /Get the make
	public String getMake() {
		return make;
	}
	
	// Set the make
	public void setMake(String make) {
		this.make = make;
	}

	// Get the model year
	public long getModelYear() {
		return modelYear;
	}

	// Set the model year
	public void setModelYear(long modelYear) {
		this.modelYear = modelYear;
	}

	// Get the price
	public double getPrice() {
		return price;
	}

	// Set the price
	public void setPrice(double price) {
		this.price = price;
	}

	// Get the color of the vehicle
	public VehicleColor getColor() {
		return color;
	}

	// Set the color of the vehicle
	public void setColor(VehicleColor color) {
		this.color = color;
	}

	// Get the type of fuel the vehicle uses
	public FuelType getFuelType() {
		return fuelType;
	}

	// Set the type of fuel the vehicle uses
	public void setFuelType(FuelType fuelType) {
		this.fuelType = fuelType;
	}

	// Get the mileage
	public double getMileage() {
		return mileage;
	}

	// Set the mileage
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	// Get the mass
	public double getMass() {
		return mass;
	}

	// Set the mass
	public void setMass(double mass) {
		this.mass = mass;
	}

	// Get the number of cylinders
	public int getCylinders() {
		return cylinders;
	}

	// Set the number of cylinders
	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}

	// Get the capacity of the gas tank
	public double getGasTankCapacity() {
		return gasTankCapacity;
	}

	// Set the capacity of the gas tank
	public void setGasTankCapacity(double gasTankCapacity) {
		this.gasTankCapacity = gasTankCapacity;
	}

	// Get the start mechanism
	public StartMechanism getStartType() {
		return startType;
	}

	// Set the start mechanism
	public void setStartType(StartMechanism startType) {
		this.startType = startType;
	}
}
