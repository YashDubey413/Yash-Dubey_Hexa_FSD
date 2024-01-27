package com.hexaware.springjdbc.dao;

import java.util.List;

import com.hexaware.springjdbc.model.Product;

public interface IProductDao {
	
	public boolean createProduct(Product product);
	public boolean updateProduct(Product product);
	
	public boolean deleteProductbyId(int productId);
	
	public Product selectProductbyId(int productId);
	
	public List<Product> selectAll();

}
