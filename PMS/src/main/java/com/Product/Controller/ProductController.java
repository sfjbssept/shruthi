package com.Product.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Product.Entity.Product;
import com.Product.Services.IProductService;

@RestController
public class ProductController {

	@Autowired
	IProductService iProductService;
	
	@PostMapping("/addProduct")
	Integer addProduct(@RequestBody Product product) {
		Integer id = iProductService.addProduct(product);
		System.out.println(id);
		return id;
	}
	
	@GetMapping("/allProducts")
	List<Product> getAllProducts(){
		return iProductService.getAllProducts();
	}
	
}
