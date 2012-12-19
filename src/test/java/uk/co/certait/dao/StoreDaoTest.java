package uk.co.certait.dao;

import org.junit.Test;

public class StoreDaoTest {

	@Test
	public void testLoadStore() {
		
		StoreDao dao = new StoreDao();
		dao.loadStore(1);
	}
}
