package com.udemy.barath.spring.springorm.product.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.udemy.barath.spring.springorm.product.dao.ProductDao;
import com.udemy.barath.spring.springorm.product.model.Product;

public class test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/udemy/barath/spring/springorm/product/test/config.xml");
		ProductDao productDao = (ProductDao) context.getBean("productDao");
		Product product = new Product();
		product.setId(1);
		product.setName("Android");
		product.setDescription("Made by Google");
		product.setPrice(400);
		productDao.create(product);
	}

}
