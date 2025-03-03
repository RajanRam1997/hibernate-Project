package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main( String[] args ) {
    	 Configuration config = new Configuration();
         config.configure("hibernate.cfg.xml");
         System.out.println("1");
         SessionFactory factory = config.buildSessionFactory();
         System.out.println("2");
         Session session = factory.openSession();
         System.out.println("3");
         Mobile m1 = new Mobile(101,"Samsung",43000);
         Transaction transaction = session.beginTransaction();
         session.save(m1);
         transaction.commit();
         System.out.println("Mobile saved");
    }
}
