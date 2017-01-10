package controllers;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import classesDAO.Uporabnik;

public class TestBaze {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Uporabnik user = new Uporabnik();
		user.setUsername("jure");
		user.setPassword("jure");
		user.setEmail("jure@adffasda.si");
		
		
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
				
		
		Uporabnik user1 = new Uporabnik();
		user1.setUsername("jure1");
		user1.setPassword("jure1");
		user1.setEmail("1jure@adffasda.si");
		
		session.beginTransaction();
		session.save(user1);
		session.getTransaction().commit();
		
	}
	
	
	
}
