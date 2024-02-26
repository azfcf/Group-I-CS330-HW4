package edu.mu.vehicle;

public class Car extends Vehicle {

	// Object constructor using superclass
	public Car(String brand, String make, long modelYear, double price, VehicleColor color, FuelType fuelType,
			double mileage, double mass, int cylinders, double gasTankCapacity, StartMechanism startType) {
		super(brand, make, modelYear, price, color, fuelType, mileage, mass, cylinders, gasTankCapacity, startType);
	}

	// Copy constructor
	public Car(Car car) {
		super(car);
	}
	
	/*
	 * Calculates the maintenance cost using the formula
	 * distance * mass * (currentYear - modelYear) * cylinders * 0.0005
	 */
	@Override
	public double calculateMaintenanceCost(double distance) {
		double maintenanceCost = distance * mass * (getCurrentYear() - modelYear) * cylinders * 0.0005;
		return maintenanceCost;
	}

	/*
	 * Calculates the fuel efficiency of the vehicle using the formula
	 * cylinders * gasTankCapacity * fuelPrice / distance * 0.003
	 */
	@Override
	public double calculateFuelEfficiency(double distance, double fuelPrice) {
		double fuelEfficiency = cylinders * gasTankCapacity * fuelPrice / distance * 0.003;
		return fuelEfficiency;
	}

	@Override
	public void startEngine() {
		System.out.println("PUSHSTART"); // Prints the start method
		
	}
	
	@Override
	public String toCSVRow() { // Converts object back into CSV-friendly format
		return "Car," + brand + "," + make + "," + modelYear + "," + price + "," + color + "," + fuelType + "," + mileage + ","
				+ mass + "," + cylinders + "," + gasTankCapacity + "," + startType;
	}

}
