package com.demo;

import java.util.Iterator;


import java.util.List;
import java.util.Scanner;
import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main( String[] args )
	{
		try {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			// Create session factory
			SessionFactory factory = configuration.buildSessionFactory();
			Session session = factory.openSession();
			Transaction t1= session.beginTransaction();
			int opt=0;
			Scanner s=new Scanner(System.in);
			do {
				System.out.println("1. Enter New Employee");
				System.out.println("2. Enter New Regular Employee");
				System.out.println("3. Enter New Contract Employee");
				System.out.println("4. Shows All Employees");
				System.out.println("5. Exit");
				System.out.println("6. Enter Your Option");
				opt=s.nextInt();
				
				switch (opt) {
				
				case 1: System.out.println("Enter the Employee id and name");
					int id=s.nextInt();
					String name=s.next();
					Employee e1=new Employee(id,name);
					session.save(e1);
					t1.commit();
					break;
				case 2:System.out.println(" Enter the Regular Employee Id and name,salary and bonus ");
					id=s.nextInt();
					name=s.next();
					int salary=s.nextInt();
					int bonus=s.nextInt();
					RegularEmployee r1=new RegularEmployee(id,name,salary,bonus);
					session.save(r1);
					t1.commit();
					break;
				
				case 3: System.out.println("Enter the contract employee Id and name,payperhour and duration");
					id=s.nextInt();
					name=s.nextLine();
					int payperhour=s.nextInt();
					String duration=s.nextLine();
					ContractEmployee c1=new ContractEmployee(id,name,payperhour,duration);
					session.save(c1);
					t1.commit();
					break;
				case 4:
						Query query=session.createQuery("From Employee");
						List emplist = query.list();
						Iterator i1= emplist.iterator();
						while(i1.hasNext()) {
							System.out.println(i1.next());
						}
						
						break;
					case 5:
						break;
				}
			}while(opt !=5);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}		

	}
}
		
//			Employee e1= new Employee(101,"Usha");
//			RegularEmployee r1= new RegularEmployee(104,"Seema",120000,10000);
//			ContractEmployee c1 = new ContractEmployee(101,"Hana",2000,"2weeks");
//			
//			session.save(e1);
//			session.save(r1);
//			session.save(c1);
//			
//			System.out.println("Regular employee saved");
//			e1.setId(101);
//			e1.setName("Geeta Patil");
//
//			r1.setBonus(5000);
//			r1.setSalary(40000);
//
//			c1.setPayperhour(1000);
//			c1.setDuration("Week");
//
//			t1.commit();
			//System.out.println("Ok");
		
			
//		} 
//		catch (Exception e) {
//			e.printStackTrace();
//		}		
//
//	}
//}
