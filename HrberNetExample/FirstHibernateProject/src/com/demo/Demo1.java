package com.demo;
import java.util.Iterator;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;
import org.hibernate.query.Query;

public class Demo1 {
	public static void main(String[] args) {
		try {
		//Configuration config=new Configuration();
		//config.configure("hibernate.cfg.xml");
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session =factory.openSession();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The employee id,name and salary");
		int i=s.nextInt();
		s.nextLine();
		String n=s.nextLine();
		int sa=s.nextInt();
		Employee e1 = new Employee(i,n,sa);
		session.save(e1);
		Transaction transaction =session.beginTransaction();
		transaction.commit();
		System.out.println("Record added");
		Query q1 = session.createQuery("from Employee");
		List <Employee> list1 = q1.list();
		Iterator i1 = list1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
