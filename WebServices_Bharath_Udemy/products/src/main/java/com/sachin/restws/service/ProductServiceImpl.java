package com.sachin.restws.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sachin.restws.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	List<Product> products = new ArrayList<>();
	private long id = 1;
	
	public ProductServiceImpl() {
		Product product = new Product();
		product.setId(++id);
		product.setDescription( "Laptop" );
		products.add( product );	
	}
	
	@Override
	public List<Product> getProducts() {
		return products;
	}

	@Override
	public long addProduct(Product product) {
		product.setId( ++id );
		products.add( product );
		return product.getId();
	}

}
