package uk.co.certait.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

@Entity
@Table(name = "stores")
public class Store {

	@SuppressWarnings("unused")
	@Id
	private int id;
	@SuppressWarnings("unused")
	private String name;

	@SuppressWarnings("unused")
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name ="store_id")
	@OrderBy(value = "displaySequence")
	private Set<Product> products;

}
