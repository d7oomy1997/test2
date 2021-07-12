package DAL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import Control.Hibernate_2;
import Entities.Students;
import Entities.Subjects;
import Entities.Teachers;

public class Student_DAL {

	public void saveUser(Students student) {
        Transaction transaction = null;
        
        try (Session session = Hibernate_2.getSessionFactory("none").openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the Teacher object
            session.save(student);
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
    public List < Students > getAllUser() {
		System.out.println("in get all list");
        Transaction transaction = null;
        List < Students > listOfUser = null;
        try (Session session = Hibernate_2.getSessionFactory("none").openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            System.out.println("10");
            String shq="from Entities.Students";
            Query<Students> q = session.createQuery(shq);
            List<Students> res=q.list();
            System.out.println("11");
            listOfUser = session.createQuery("from Entities.Students").getResultList();
            
            
            System.out.println("The list : "+res);

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
            Students user = session.get(Students.class, id);
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
	
}
