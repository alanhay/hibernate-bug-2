package uk.co.certait.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name = "products")
@SecondaryTable(name ="products_additional_data")
public class Product {
	
	@SuppressWarnings("unused")
	@Id
	private int id;
	
	@SuppressWarnings("unused")
	private String name;
	@SuppressWarnings("unused")
	private String description;
	
	@SuppressWarnings("unused")
	@Column(table = "products_additional_data")
	private String category;
	
	@SuppressWarnings("unused")
	@Column(table = "products_additional_data")
	private int displaySequence;
}
