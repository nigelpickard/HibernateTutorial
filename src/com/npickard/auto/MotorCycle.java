/**
 * 
 */
package com.npickard.auto;

/**
 * @author nigel
 *
 */
public class MotorCycle extends MotorVehicle {
	private int handlebarWidth;
	
	public MotorCycle(){
		
	}
	
	public MotorCycle(String manufacturer, String model, int topSpeed, int passengerCapacity, int handlebarWidth){
		super(manufacturer, model, topSpeed, passengerCapacity);
		this.handlebarWidth = handlebarWidth;
	}

	public int getHandlebarWidth() {
		return handlebarWidth;
	}

	public void setHandlebarWidth(int handlebarWidth) {
		this.handlebarWidth = handlebarWidth;
	}
	
	public String toString(){
		return super.toString() + ", handle bar width: " + handlebarWidth;
	}
}
