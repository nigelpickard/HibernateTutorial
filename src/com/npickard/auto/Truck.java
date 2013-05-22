package com.npickard.auto;

public class Truck extends MotorVehicle {
	private int loadCapacity;

	public Truck(String manufacturer, String model, int topSpeed, int passengerCapacity, int loadCapacity){
		super(manufacturer, model, topSpeed, passengerCapacity);
		this.loadCapacity = loadCapacity;
	}
	
	public int getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}
	
	public String toString(){
		return super.toString() + ", load capacity: " + loadCapacity;
	}
}
