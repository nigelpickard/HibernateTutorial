package com.npickard;

import org.hibernate.Session;

import com.npickard.hibernate.common.Customer;
import com.npickard.hibernate.persistence.HibernateUtil;

public class App{
    public static void main( String[] args ){
        System.out.println("Hibernate 4 example");
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setLastName("Doe");
        session.save(customer);
        session.getTransaction().commit();
    }
}