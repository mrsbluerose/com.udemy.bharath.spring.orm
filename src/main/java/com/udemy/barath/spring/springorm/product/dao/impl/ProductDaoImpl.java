package com.udemy.barath.spring.springorm.product.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.udemy.barath.spring.springorm.product.dao.ProductDAO;
import com.udemy.barath.spring.springorm.product.model.Product;

@Component
public class ProductDaoImpl implements ProductDAO {
	
	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	public int create(Product product) {
		
		return 0;
	}

}
