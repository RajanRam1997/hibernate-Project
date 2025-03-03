package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       Configuration config=new Configuration();
       config.configure("hibernate.cfg.xml");
       SessionFactory factory=config.buildSessionFactory();
       Session session=factory.openSession();
       Doctor d1=new Doctor(1001,"Dr.Patil","Hadapser",80000);
       try {
       Transaction transaction = session.beginTransaction();
       session.save(d1);
       transaction.commit();
    	System.out.println( "Doctor saved!" );
       }
       catch(Exception e) {
    	   System.out.println(e);
       }
       finally {
    	   session.close();
    	   factory.close();
       }
    }
}
