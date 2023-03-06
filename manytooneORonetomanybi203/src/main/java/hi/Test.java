package hi;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Test {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
//		Mobile m=new Mobile();
//		m.setBrand("realme");
//		m.setCost(9600);
//		
//		Sim sim1=new Sim();
//		sim1.setType("2G");
//		sim1.setNetProvider("Jio");
//		sim1.setMobile(m);
//		
//		Sim sim2=new Sim();
//		sim2.setType("5G");
//		sim2.setNetProvider("BSNL");
//		sim2.setMobile(m);
//		
//		List<Sim> sims=new ArrayList<Sim>();
//		sims.add(sim2);
//		sims.add(sim1);
//		
//		m.setSims(sims);
//		
//		et.begin();
//		em.persist(m);
//		et.commit();
//		
		
		et.begin();
		Mobile m=em.find(Mobile.class, 1);
		em.remove(m);
		et.commit();
		
		
		
		
		
		
		
		
		
		
		
	}

}
