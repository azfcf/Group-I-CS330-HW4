# Group-I-CS330-HW4


## DESCRIPTION
This project is a vehicle management system. It takes a CSV file, reads it, and creates an ArrayList of vehicles such as Trucks, MotorBikes, Cars, and SUVs from the CSV file. The VehicleManager class can add vehicles to the ArrayList, remove vehicles from the ArrayList, return specific vehicles in the ArrayList, and much more. The VehicleManager class is also able to write back to the CSV file when changes to the vehicleList have been made. 

## HOW TO RUN
To run this program, please clone the repository and run the Main file, which can be found in "edu.mu.main.Main". In the Main file, you are free to test out any of the VehicleManager Methods. 

For this program to work correctly, please ensure that the entires in the CSV file are organized as follows...
`Type, Model, Make, ModelYear, Price, Color, FuelType, Mileage, Mass, Cylinders, GasTankCapacity, StartType`

## VEHICLEMANAGER METHODS
Below is a short description of each method in the VehicleManger class
- `getVehicleList()`
  - Returns the vehicleList
- `initializeStock()`
  - Reads from the CSV file and initializes vehicleList
- `displayAllCarInformation()`
  - Displays all information about Cars in vehicleList
- `displayAllTruckInformation()`
  - Displays all information about Trucks in vehicleList
- `displayAllSUVInformation()`
  - Displays all information about SUVs in vehicleList
- `displayAllMotorBikeInformation()`
  - Displays all information about Motor Bikes in VehiclesList
- `displayVehicleInformation(Vehicle v)`
  - Displays information about a specific vehicle that was passed into the method
- `displayAllVehicleInformation()`
  - Displays information from all of the Vehicles in the vehicleList
- `removeVehicle(Vehicle vehicle)`
  - Removes a vehicle from the vehicleList
- `addVehicle(Vehicle vehicle)`
  - Adds a vehicle to the vehicleList
- `saveVehicleList()`
  -Writes the vehicleList to the CSV file
- `getNumberOfVehiclesByType(Class clazz)`
  - Returns the number of a specific vehicle in the vehicleList
- `getVehicleWithHighestMaintenanceCost(double distance)`
  - Returns the vehicle in vehicleList with the highest maintenance cost
- `getVehicleWithLowestMaintenanceCost(double distance)`
  - Returns the vehicle in vehicleList with the lowest maintenance cost
- `getVehicleWithHighestFuelEfficiency(double distance, double fuelPrice)`
  - Returns the vehicle in vehicleList with the highest fuel efficiency
- `getVehicleWithLowestFuelEfficiency(double distance, double fuelPrice)`
  - Returns the vehicle in vehicleList with the lowest fuel efficiency
- `getAverageFuelEfficiencyofSUVs(double distance, double fuelPrice)`
  - Returns the average fuel efficiency of all SUVs in vehicleList

## Dependencies
Java JDK 21

## Team Members
- Alber Zhou
- Dion Burns
- Logan Bird
- Ryan Esparza
