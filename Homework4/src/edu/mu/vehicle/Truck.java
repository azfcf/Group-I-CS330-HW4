package edu.mu.vehicle;

public class Truck extends Vehicle {
	
	// Object constructor using superclass
	public Truck(String brand, String make, long modelYear, double price, VehicleColor color, FuelType fuelType,
			double mileage, double mass, int cylinders, double gasTankCapacity, StartMechanism startType) {
		super(brand, make, modelYear, price, color, fuelType, mileage, mass, cylinders, gasTankCapacity, startType);
	}
	
	// Copy constructor
	public Truck(Truck truck) {
		super(truck);
	}

	/*
	 * Calculates the maintenance cost using the formula
	 * distance * mass * (currentYear - modelYear) * cylinders * 0.002
	 */
	@Override
	public double calculateMaintenanceCost(double distance) {
		double maintenanceCost = distance * mass * (getCurrentYear() - modelYear) * cylinders * 0.002;
		return maintenanceCost;
	}

	/*
	 * Calculates the fuel efficiency of the vehicle using the formula
	 * cylinders * gasTankCapacity * fuelPrice / distance * 0.1
	 */
	@Override
	public double calculateFuelEfficiency(double distance, double fuelPrice) {
		double fuelEfficiency = cylinders * gasTankCapacity * fuelPrice / distance * 0.1;
		return fuelEfficiency;
	}

	@Override
	public void startEngine() {
		System.out.println("KEYSTART"); // Prints the start method
		
	}

	@Override 
	public String toCSVRow() { // Converts object back into CSV-friendly format
		return "Truck," + brand + "," + make + "," + modelYear + "," + price + "," + color + "," + fuelType + "," + mileage + ","
				+ mass + "," + cylinders + "," + gasTankCapacity + "," + startType;
	}
}
