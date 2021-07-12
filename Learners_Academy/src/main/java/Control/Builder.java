package Control;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import Entities.Subjects;

public class Builder {

	Configuration configuration;
	StandardServiceRegistryBuilder builder;
	SessionFactory factory;
	Session session;
	Transaction transaction;
	
	public Builder(){

		configuration = new Configuration().configure();  // Create the configuration.
		
		configuration.addAnnotatedClass(Entities.Subjects.class);
		configuration.addAnnotatedClass(Entities.Classes.class);
		
		builder = 
				 new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());  // get the configuration in the player class
		factory= configuration.buildSessionFactory(builder.build());              // build the session
		
		session = factory.openSession();         	    		// create a session
		transaction=session.beginTransaction();				// create transaction
		
	
	}
	
	public void createNewSubject(String s_name,int credits) {
		
		session.save(new Subjects(s_name,credits));
		
	}
	
	public void createNewClass() {
			
	
	}
	
	public void saveIt() {
		
		transaction.commit();
		session.close();
		
	}
	
	/*
	public static void main(String[] args) {
		Builder b=new Builder();
		
		b.createNewSubject("PHYS", 4);
		b.createNewSubject("math", 4);
		
		b.saveIt();
		
	}*/
	
}
