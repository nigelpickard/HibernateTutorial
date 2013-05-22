/**
 * 
 */
package com.npickard.auto;

/**
 * @author nigel
 * MotorVehicle is the super class of all types of motor vehicles
 * e.g. car, motorcycle, truck
 *
 */
public class MotorVehicle {
	private String manufacturer;
	private String model;
	private int topSpeed;
	private int passengerCapacity;
	
	public MotorVehicle(){
	}
	
	public MotorVehicle(String manufacturer, String model, int topSpeed, int passengerCapacity){
		this.manufacturer = manufacturer;
		this.model = model;
		this.topSpeed = topSpeed;
		this.passengerCapacity = passengerCapacity;
	}
		
	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public int getPassengerCapacity() {
		return passengerCapacity;
	}

	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}

	public String toString(){
		return "Manufacturer: " + manufacturer +
				", Model: " + model +
				", Top speed: " + topSpeed + 
				", Passenger capacity: " + passengerCapacity;
	}
	
}
