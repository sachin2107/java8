package com.sachin.restws.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.sachin.restws.model.Product;

@Path("/productservice")
public interface ProductService {

	@Path("/products")
	@GET
	public List<Product> getProducts();
	
	@Path("/products")
	@POST
	public long addProduct( Product product );
}
