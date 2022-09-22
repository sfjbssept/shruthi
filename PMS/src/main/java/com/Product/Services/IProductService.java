package com.Product.Services;

import java.util.List;

import com.Product.Entity.Product;

public interface IProductService {

	Integer addProduct(Product product);
	public List<Product> getAllProducts();

}
