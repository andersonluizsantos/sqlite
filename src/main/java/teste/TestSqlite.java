package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class TestSqlite {
	public static void main(String[] args) {
		User user = new User();
		user.setId(1);
		user.setName("Anderson");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu-sqlite-jpa");

		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

}
