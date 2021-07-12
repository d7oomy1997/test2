package Control;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import Entities.Classes;
import Entities.Subjects;

public class HibernateMain {
/*
	public static void main(String[] args) {
		
		try {
			
			Configuration configuration = new Configuration().configure();  // Create the configuration.
			
			configuration.addAnnotatedClass(Entities.Subjects.class);
			configuration.addAnnotatedClass(Entities.Classes.class);
			
			StandardServiceRegistryBuilder builder = 
					 new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());  // get the configuration in the player class
			SessionFactory factory= configuration.buildSessionFactory(builder.build());              // build the session
			
			Session session = factory.openSession();         	    		// create a session
			Transaction transaction=session.beginTransaction();				// create transaction
			
			
			Subjects s= new Subjects("MATH",3);
			Subjects s1= new Subjects("SWE",3);
			
			Classes c=new Classes(s1, 1200, 8);
			
			session.save(s);
			session.save(s1);
			session.save(c);
			
			
			
			
			transaction.commit();
			session.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
	*/
	
}
