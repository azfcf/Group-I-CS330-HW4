package edu.mu.vehicle;

public class MotorBike extends Vehicle{

	public MotorBike(String brand, String make, long modelYear, double price, VehicleColor color, FuelType fuelType,
			double mileage, double mass, int cylinders, double gasTankCapacity, StartMechanism startType) {
		super(brand, make, modelYear, price, color, fuelType, mileage, mass, cylinders, gasTankCapacity, startType);
		// TODO Auto-generated constructor stub
	}
	
	public MotorBike(MotorBike motorBike) {
		super(motorBike);
	}

	@Override
	public double calculateMaintenaceCost(double distance) {
		double maintenanceCost = distance * mass * (getCurrentYear() - modelYear) * cylinders * 0.0002;
		return maintenanceCost;
	}

	@Override
	public double calculateFuelEfficiency(double distance, double fuelPrice) {
		double fuelEfficiency = cylinders * gasTankCapacity * fuelPrice / distance * 0.001;
		return fuelEfficiency;
	}

	@Override
	public void startEngine() {
		System.out.println("KICKSTART");
		
	}

	@Override
	public String toCSVRow() {
		return "MotorBike," + "," + make + "," + modelYear + "," + price + "," + color + "," + fuelType + "," + mileage + ","
				+ mass + "," + cylinders + "," + gasTankCapacity + "," + startType;
	}
}
