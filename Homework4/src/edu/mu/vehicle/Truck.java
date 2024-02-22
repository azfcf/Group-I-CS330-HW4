package edu.mu.vehicle;

public class Truck extends Vehicle {
	
	public Truck(String brand, String make, long modelYear, double price, VehicleColor color, FuelType fuelType,
			double mileage, double mass, int cylinders, double gasTankCapacity, StartMechanism startType) {
		super(brand, make, modelYear, price, color, fuelType, mileage, mass, cylinders, gasTankCapacity, startType);
		// TODO Auto-generated constructor stub
	}
	
	public Truck(Truck truck) {
		super(truck);
	}

	@Override
	public double calculateMaintenaceCost(double distance) {
		double maintenanceCost = distance * mass * (getCurrentYear() - modelYear) * cylinders * 0.002;
		return maintenanceCost;
	}

	@Override
	public double calculateFuelEfficiency(double distance, double fuelPrice) {
		double fuelEfficiency = cylinders * gasTankCapacity * fuelPrice / distance * 0.1;
		return fuelEfficiency;
	}

	@Override
	public void startEngine() {
		System.out.println("KEYSTART");
		
	}

	@Override
	public String toCSVRow() {
		return "Truck," + "," + make + "," + modelYear + "," + price + "," + color + "," + fuelType + "," + mileage + ","
				+ mass + "," + cylinders + "," + gasTankCapacity + "," + startType;
	}
}
