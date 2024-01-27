package com.hexaware.springjdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springjdbc.dao.IProductDao;
import com.hexaware.springjdbc.model.Product;

@Service
public class ProductServiceImp implements IProductService {

	@Autowired
	IProductDao dao;
	
	
	@Override
	public boolean createProduct(Product product) {
		
		return dao.createProduct(product);
	}

	@Override
	public boolean updateProduct(Product product) {
		
		return dao.updateProduct(product);
	}

	@Override
	public boolean deleteProductbyId(int productId) {
		
		return dao.deleteProductbyId(productId);
	}

	@Override
	public Product selectProductbyId(int productId) {
		
		return dao.selectProductbyId(productId);
	}

	@Override
	public List<Product> selectAll() {
		
		return dao.selectAll();
	}

}
