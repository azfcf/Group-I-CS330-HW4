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
	
	public Vehicle() {
	}
	
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
	
	protected int getCurrentYear() {
		return ZonedDateTime.now().getYear();
	}
	
	public abstract String toCSVRow();
	public abstract double calculateMaintenaceCost(double distance); // calculates maintenance cost for a specific vehicle
	public abstract double calculateFuelEfficiency(double distance, double fuelPrice); // calculates the engine efficiency
	public abstract void startEngine(); // prints how the vehicle starts
	
	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", make=" + make + ", modelYear=" + modelYear + ", price=" + price
				+ ", color=" + color + ", fuelType=" + fuelType + ", mileage=" + mileage + ", mass=" + mass
				+ ", cylinders=" + cylinders + ", gasTankCapacity=" + gasTankCapacity + ", startType=" + startType
				+ "]";
	}
}
