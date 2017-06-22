package com.karan.annotation.testclassforAll;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.karan.annotation.employee.test.AccountEntity;
import com.karan.annotation.employee.test.EmployeeEntity;

public class EmpTestHbr {
	
	public static void main( String[] args )
    {
       SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
       Session session =sessionFactory.openSession();
       session.beginTransaction();
       
       AccountEntity account1 = new AccountEntity();
       account1.setAccountNumber("Account detail 1");

       AccountEntity account2 = new AccountEntity();
       account2.setAccountNumber("Account detail 2");

       AccountEntity account3 = new AccountEntity();
       account3.setAccountNumber("Account detail 3");
       
       AccountEntity account4 = new AccountEntity();
       account4.setAccountNumber("Account detail 4");

       AccountEntity account5 = new AccountEntity();
       account5.setAccountNumber("Account detail 5");

       //Add new Employee object
       EmployeeEntity firstEmployee = new EmployeeEntity();
       firstEmployee.setEmail("demo-user-first@mail.com");
       firstEmployee.setFirstName("demo-one");
       firstEmployee.setLastName("user-one");

       EmployeeEntity secondEmployee = new EmployeeEntity();
       secondEmployee.setEmail("demo-user-second@mail.com");
       secondEmployee.setFirstName("demo-two");
       secondEmployee.setLastName("user-two");

       Set<AccountEntity> accountsOfFirstEmployee = new HashSet<AccountEntity>();
       accountsOfFirstEmployee.add(account1);
       accountsOfFirstEmployee.add(account2);

       Set<AccountEntity> accountsOfSecondEmployee = new HashSet<AccountEntity>();
       accountsOfSecondEmployee.add(account3);
       accountsOfSecondEmployee.add(account4);
       accountsOfSecondEmployee.add(account5);

       firstEmployee.setAccounts(accountsOfFirstEmployee);
       secondEmployee.setAccounts(accountsOfSecondEmployee);
       //Save Employee
       session.save(firstEmployee);
       session.save(secondEmployee);

       
       
       
       
       session.getTransaction().commit();
    }

}
