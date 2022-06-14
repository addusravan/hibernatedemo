package com.kumar.demohib;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class Update 
{
    public static void main( String[] args )
    {  
    	
    	
    	int id=2;
    	
      
       Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class);
       SessionFactory sf=con.buildSessionFactory();
      
      
       
       
       Session k=sf.getCurrentSession();
       Transaction tr=k.beginTransaction();
       
       k.createQuery("update Alien set name='ravi'").executeUpdate();
     
       //Alien alien=k.get(Alien.class,id);
      // alien.setColour("saffaron");
       
       
     
       
       
       
       
      
       
       tr.commit();
       
       
       
       
       
       
       
       
       
       
       
    }
}
