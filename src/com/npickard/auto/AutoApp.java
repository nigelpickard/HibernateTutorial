/**
 * 
 */
package com.npickard.auto;

import org.apache.log4j.Logger;

import com.npickard.app.App;

/**
 * @author nigel
 *
 */
public class AutoApp extends App{
	static Logger logger = Logger.getLogger(AutoApp.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MotorVehicle truck = new Truck("Ford", "F150", 85, 3, 10000);
		logger.info("Truck is " + truck.toString());
		MotorVehicle motorCycle = new MotorCycle("Honda", "CB100N", 85, 3, 30);
		logger.info("Motorcycle is " + motorCycle.toString());
	}

}
