package com.kumar.demohib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class RetreiveQuery 
{
    public static void main( String[] args )
    {  
    	
    	System.out.print("creating object");
       Alien t1=new Alien("black","sravan");
       Alien t2=new Alien("red","sravan");
       Alien t3=new Alien("black","krishna");
       Alien t4=new Alien("orange","krishna");
      
       
       
       System.out.print(t2);
      
       Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class);
       SessionFactory sf=con.buildSessionFactory();
       Session s=sf.getCurrentSession();
       
       Transaction tx=s.beginTransaction();
       
       System.out.print("saved");
       s.save(t1);
       s.save(t2);
       s.save(t3);
       s.save(t4);
       tx.commit();
       
       
       Session k=sf.getCurrentSession();
       Transaction tr=k.beginTransaction();
       Alien t7=k.get(Alien.class,t4.getId());
       System.out.print(t7);
       
       tr.commit();
       
       
       
       
       
       
       
       
       
       
       
    }
}
