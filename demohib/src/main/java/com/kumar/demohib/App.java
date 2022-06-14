package com.kumar.demohib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {  
    	
    	
    	
    	int id=2;
    	
      
       Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class);
       SessionFactory sf=con.buildSessionFactory();
      
      
       
       
       Session k=sf.getCurrentSession();
       Transaction tr=k.beginTransaction();
    //   List<Alien>alien=k.createQuery("from Alien alien  where alien.colour='black'").getResultList();
       
       
     /*  for(Alien n:alien) {
        System.out.println(n);
       }*/
       Alien alien=k.get(Alien.class,id);
       alien.setColour("yellow");
       
       
       tr.commit();
       
       
       
       
       
       
       
       
       
       
       
    }
}
