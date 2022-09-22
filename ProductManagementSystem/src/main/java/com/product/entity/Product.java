package com.product.entity;

import javax.persistence.*;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer id;
	private String productName;
	private String productBrand;
	private String productCategory;
	private int productPrice;
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public Product(Integer id, String productName, String productBrand, String productCategory, int productPrice) {
		super();
		this.id = id;
		this.productName = productName;
		this.productBrand = productBrand;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
