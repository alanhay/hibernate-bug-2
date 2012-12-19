package uk.co.certait.domain;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.MapKey;
import javax.persistence.Table;

@Entity
@Table(name = "stores")
public class Store {

	@SuppressWarnings("unused")
	@Id
	private int id;
	@SuppressWarnings("unused")
	private String name;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "stores_products", joinColumns = @JoinColumn(name = "store_id"), inverseJoinColumns = @JoinColumn(name = "product_id"))
	@MapKey(name = "category")
	private Map<String, Product> products;

	public Map<String, Product> getProducts() {
		return products;
	}
}
