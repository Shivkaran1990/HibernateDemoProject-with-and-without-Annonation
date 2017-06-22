package com.karan.hbr.HibernetDemo;

import java.util.Date;

import javax.transaction.Transaction;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionfactory.openSession();
        session.beginTransaction();
        Employee e1=new Employee();
        e1.setName("Ritu");
        e1.setSurname("Sharma");
        
        Student s1=new Student();
        s1.setName("karan");
        s1.setSurname("Ravidas");
        s1.setDOB(new Date());
        s1.setMobileNumber("9860214064");
        session.save(s1);
        session.getTransaction().commit();
    }
}
