package com.udemy.barath.spring.springorm.product.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.udemy.barath.spring.springorm.product.dao.ProductDao;
import com.udemy.barath.spring.springorm.product.model.Product;

public class test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/udemy/barath/spring/springorm/product/test/config.xml");
		ProductDao productDao = (ProductDao) context.getBean("productDao");
		//Product product = new Product();
//		product.setId(1);
//		product.setName("Pixel");
//		product.setDescription("Made by Google");
//		product.setPrice(800);
		//productDao.create(product);
		//productDao.update(product);
		//productDao.delete(product);
		//Product product = productDao.find(1);
		List<Product> products = productDao.findAll();
		System.out.println(products);
		
	}

}
