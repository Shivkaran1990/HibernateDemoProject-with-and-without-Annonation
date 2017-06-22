package com.karan.annotation.testclassforAll;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.karan.annotation.demo.Category;
import com.karan.annotation.demo.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionfactory.openSession();
        session.beginTransaction();
        
        //---------------------------------------
        
        Category category = new Category("Computer");
        
        Product pc = new Product("DELL PC", "Quad-core PC", 1200, category);
        Product laptop = new Product("MacBook", "Apple High-end laptop", 2100, category);
        Product phone = new Product("iPhone 5", "Apple Best-selling smartphone", 499, category);
        Product tablet = new Product("iPad 3", "Apple Best-selling tablet", 1099, category);
        Set<Product> products = new HashSet<Product>();
        products.add(pc);
        products.add(laptop);
        products.add(phone);
        products.add(tablet);
         
        category.setProducts(products);
         
        session.save(category);
         
        
        //----------------------------------------

        Category category1 = new Category("Moible");
        
        Product p1 = new Product("Samsang", "best phone", 12000, category1);
        Product p2 = new Product("Redmi", "Osome Phone best ", 5000, category1);
        Product p3 = new Product("iPhone 5", "Farji Phone", 52000, category1);
        Product p4 = new Product("One Plus", "Not bad",30000, category1);
        Set<Product> product = new HashSet<Product>();
        product.add(p1);
        product.add(p2);
        product.add(p3);
        product.add(p4);       
        category.setProducts(product);
         
        session.save(category1);
         
        
        //----------------------------------------
        

        session.getTransaction().commit();
    }
}
