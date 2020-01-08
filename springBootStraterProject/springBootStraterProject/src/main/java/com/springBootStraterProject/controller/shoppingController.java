package com.springBootStraterProject.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springBootStraterProject.model.Customer;
import com.springBootStraterProject.model.Product;
import com.springBootStraterProject.service.CustomerService;

@RestController
public class shoppingController {
	
	@Autowired
	private CustomerService customerService;
	
	
	
	
	@GetMapping(value = "/fruits")
	public Customer getCoustmerDetails() {

		Product p1 = new Product(10, "Apple", 25.5f);
		Product p2 = new Product(11, "Mango", 25.5f);
		Product p3 = new Product(12, "Grapes", 25.5f);

		List<Product> products = new ArrayList<>();
		products.add(p1);
		products.add(p3);
		Customer customer = new Customer();
		customer.setCustId(6162);
		customer.setCustName("saikrishna");
		customer.setProducts(products);
		return customer;

	}
	@GetMapping(value = "/fruits/{custId}", produces={MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public Customer getCoustmerDetailsById(@PathVariable int custId) {
		 return customerService.getCustomerById(custId);
	
	
	}

}
