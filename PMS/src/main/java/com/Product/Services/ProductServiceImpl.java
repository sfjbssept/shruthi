package com.Product.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Product.Entity.Product;
import com.Product.Repo.IProductRepo;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	IProductRepo iProductRepo; 
	@Override
	public Integer addProduct(Product product) {
		Product addProduct = iProductRepo.save(product);
		return addProduct.getId();
	}
	@Override
	public List<Product> getAllProducts() {
		return iProductRepo.findAll();
	}
}
