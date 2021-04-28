package com.udemy.barath.spring.springorm.product.dao.impl;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.udemy.barath.spring.springorm.product.dao.ProductDAO;
import com.udemy.barath.spring.springorm.product.model.Product;

public class ProductDaoImpl implements ProductDAO {
	
	HibernateTemplate hibernateTemplate;

	@Override
	public int create(Product product) {
		
		return 0;
	}

}
