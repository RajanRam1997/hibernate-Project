package com.demo;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        try {
        	Configuration config=new Configuration();
        	config.configure("hibernate.cfg.xml");
        	SessionFactory factory=config.buildSessionFactory();
        	Session session=factory.getCurrentSession();
        	Transaction t1=session.beginTransaction();
        	Employee e1=new Employee();
        	RegularEmployee r1=new RegularEmployee();
        	ContractEmployee c1=new ContractEmployee(101,"rajan ram",20000,"3Weeks");
        	e1.setId(101);
        	e1.setName("Laddy Ram");
        	
        	r1.setBonus(5000);
        	r1.setSalary(25000);
        	
        	c1.setPayperhour(1200);
        	c1.setDuration("Week");
        	
        	session.save(e1);
        	session.save(r1);
        	session.save(c1);
        	
        	t1.commit();
			
			System.out.println("Ok");
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
    }
}
