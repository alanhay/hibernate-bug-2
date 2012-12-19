package uk.co.certait.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import uk.co.certait.domain.Store;

public class StoreDao {

	public Store loadStore(int id) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
		EntityManager em = emf.createEntityManager();

		return em.find(Store.class, id);
	}
}
