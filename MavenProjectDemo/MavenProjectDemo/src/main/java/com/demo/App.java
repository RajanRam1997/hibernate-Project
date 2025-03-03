package com.demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       Configuration config = new Configuration();
       config.configure("hibernate.cfg.xml");
       
       SessionFactory factory = config.buildSessionFactory();
       Session session = factory.openSession();
       
       Mobile m1 = new Mobile(102,"Samsung",43000);
       Transaction transaction = session.beginTransaction();
       
       session.save(m1);
       transaction.commit();
       
       System.out.println("Mobile saved");
    }
}