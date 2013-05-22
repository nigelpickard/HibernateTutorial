/**
 * 
 */
package com.npickard.helloworld;

import org.apache.log4j.Logger;

/**
 * 
 * @hibernate.class
 * table="GREETING"
 * @author nigel
 *
 */
public class Greeting {
	static Logger logger = Logger.getLogger(Message.class);
	private Long id;

	private String morningExclamation;
	private String middayExclamation;
	private String eveningExclamation;

	public Greeting(){
		
	}

	public Greeting(String morningExclamation, String middayExclamation, String eveningExclamation){
		this.morningExclamation = morningExclamation;
		this.middayExclamation = middayExclamation;
		this.eveningExclamation = eveningExclamation;
	}

	/**
	 * @hibernate.id
	 * generator-class="native"
	 * column="GREETING_ID"
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @hibernate.property
	 */
	public String getMorningExclamation() {
		return morningExclamation;
	}
	
	public void setMorningExclamation(String morningExclamation) {
		this.morningExclamation = morningExclamation;
	}

	/**
	 * @hibernate.property
	 */
	public String getMiddayExclamation() {
		return middayExclamation;
	}

	public void setMiddayExclamation(String middayExclamation) {
		this.middayExclamation = middayExclamation;
	}

	/**
	 * @hibernate.property
	 */
	public String getEveningExclamation() {
		return eveningExclamation;
	}
	
	public void setEveningExclamation(String eveningExclamation) {
		this.eveningExclamation = eveningExclamation;
	}
	
}
