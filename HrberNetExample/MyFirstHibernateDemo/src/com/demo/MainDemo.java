package com.demo;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainDemo {
	public static void main(String[] args) {
		try {
			Configuration config=new Configuration();
			config.configure("hibernate.cfg.xml");
			SessionFactory factory=config.buildSessionFactory();
			Session session=factory.openSession();
			Car c1=new Car(101,"Scorpio","Blue",100000);
			session.save(c1);
			Transaction transaction =session.beginTransaction();
			transaction.commit();
			System.out.println("Your car object is saved !!");
			session.close();
			}
			catch(Exception e) {
				System.out.println(e);
			}
	}
}
