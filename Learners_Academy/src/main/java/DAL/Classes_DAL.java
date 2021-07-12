package DAL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import Control.Hibernate_2;
import Entities.Classes;
import Entities.Students;
import Entities.Subjects;

public class Classes_DAL {

	public void saveUser(Classes classes) {
        Transaction transaction = null;
        
        try (Session session = Hibernate_2.getSessionFactory("none").openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the Teacher object
            System.out.println("^^%^^ Class to save : "+classes);
            session.save(classes);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
	
	@SuppressWarnings("unchecked")
    public List getAllUser() {
		
        Transaction transaction = null;
        List<Object[]> listOfUser = null;
        try (Session session = Hibernate_2.getSessionFactory("none").openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            //System.out.println("10");
            //String shq="from Entities.Classes";
            //Query<Classes> q = session.createQuery(shq);
            //List<Classes> res=q.list();
            
        
            
            String qqr="select C.id, S.name, C.roomNo, C.time from Entities.Classes C, Entities.Subjects S where C.f_name=S.id";
            
            Query q=session.createQuery(qqr);
            
            listOfUser = q.getResultList();
        
            
            for(Object[] o:listOfUser) {
            	System.out.println((Integer)o[0]);
            	System.out.println((String)o[1]);
            	System.out.println((Integer)o[2]);
            	System.out.println((Integer)o[3]);
            }

            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                //transaction.rollback();
            	System.out.println("transaction closed!!");
            }
            e.printStackTrace();
        }
        return listOfUser;
    }
	
	public void deleteUser(int id) {

        Transaction transaction = null;
        try (Session session = Hibernate_2.getSessionFactory("none").openSession()) {
            // start a transaction
            transaction = session.beginTransaction();

            // Delete a user object
            Classes user = session.get(Classes.class, id);
            if (user != null) {
                session.delete(user);
                System.out.println("user is deleted");
            }

            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
	
	@SuppressWarnings("unchecked")
    public List get_Class_Info() {
		
        Transaction transaction = null;
        List<Object[]> listOfUser = null;
        try (Session session = Hibernate_2.getSessionFactory("none").openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            //System.out.println("10");
            //String shq="from Entities.Classes";
            //Query<Classes> q = session.createQuery(shq);
            //List<Classes> res=q.list();
            
        
            
            String qqr="select C.id, S.name, C.roomNo, C.time from Entities.Classes C, Entities.Subjects S where C.f_name=S.id";
            
            Query q=session.createQuery(qqr);
            
            listOfUser = q.getResultList();
        
            
            for(Object[] o:listOfUser) {
            	System.out.println((Integer)o[0]);
            	System.out.println((String)o[1]);
            	System.out.println((Integer)o[2]);
            	System.out.println((Integer)o[3]);
            }

            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                //transaction.rollback();
            	System.out.println("transaction closed!!");
            }
            e.printStackTrace();
        }
        return listOfUser;
    }
	
}
