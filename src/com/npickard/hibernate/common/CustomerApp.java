package com.npickard.hibernate.common;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.npickard.app.App;
import com.npickard.hibernate.persistence.HibernateUtil;

public class CustomerApp extends App{
	// Define a static logger variable so that it references the
	// Logger instance named "HelloWorld".
	static Logger logger = Logger.getLogger(CustomerApp.class);
	
    public static void main( String[] args ){
    	CustomerApp app = new CustomerApp();
    	app.runCustomerExample();
    }
    
    
    private void runCustomerExample(){
    	logger.info("Hibernate 4 Customer example");
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setLastName("Doe");
        session.save(customer);
        session.getTransaction().commit();	
    }
 
}