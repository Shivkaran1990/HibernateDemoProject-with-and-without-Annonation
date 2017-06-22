package com.karan.annotation.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "PRODUCT")
public class Product {

	private long id;
	private String name;
	private String description;
	private float price;
	private Category category;
	
	public Product()
	{
		
	}
	public Product(String name, String description, float price,Category category )
	{
		 this.name = name;
	        this.description = description;
	        this.price = price;
	        this.category = category;
	}
	
	
	
	
	
	@Id
	@GeneratedValue
	@Column(name="PRODUCT_ID")
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public float getPrice() {
		return price;
	}
	@ManyToOne
	@JoinColumn(name="CATEGORY_ID")
	public Category getCategory() {
		return category;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public void setCategory(Category category) {
		this.category = category;
	}

}
