package com.example.demo.hibernatedemo;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.demo.entity.Laptop;
import com.example.demo.entity.Student;

public class App {
	public static void main(String[] args) {
		
				
		Laptop laptop =new Laptop();
		laptop.setLid(101);
		laptop.setName("DELL");
		
		Student s=new Student();
		s.setName("rahulparimella");
		s.setMarks(123);
		s.setRollno(1);
	
//		Student s2=new Student();
//		s2.setName("rahulparimella");
//		s2.setMarks(123);
//		s2.setRollno(2);
		
Configuration config =new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		
		SessionFactory sf =config.buildSessionFactory();
		Session session= sf.openSession();
		session.beginTransaction();
		session.save(s);
		//session.save(s2);
		session.save(laptop);
		session.getTransaction().commit();


		
		
		

	
	}
}

//hibernate advantages
//1.	It maps the java objects to database tables
//2. 	Provides simple API's to store or retrive data from database
//3.	If you want to change the data in data base table ,then you need to change the XML file properties
//4.	Hibernate doesnot require an application server to opera