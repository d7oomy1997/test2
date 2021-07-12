package DAL;




import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import Control.Hibernate_2;
import Entities.Adminstorator;
import Entities.Subjects;

public class login_DAL {

	public boolean loginValidation(String name,String password) {
        Transaction transaction = null;
        boolean state=false;
        System.out.println("5");
        try (Session session = Hibernate_2.getSessionFactory("none").openSession()) {
            // start a transaction
        	System.out.println("i'm here  DAL");
        	
            transaction = session.beginTransaction();
            String t="Adminstorator A";
            String query="select  A.name, A.password from "+t;
            Query q=session.createQuery(query);
            
            List<Object[]> oa=q.list();
          
            String qname="none";
            int qpass=0;
            
            for(Object[] u:oa) {
            	qname=(String)u[0];
            	qpass=(Integer)u[1];
            }
            
            if(qname.equals(qname) && qpass==Integer.parseInt(password)) {
            	state=true;
            }
             
            System.out.println(" the result is : "+qname+" - "+qpass+" // "+name+" - "+password);
            
            
            
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        // return the if found
        return state;
        
    }	
	
}
