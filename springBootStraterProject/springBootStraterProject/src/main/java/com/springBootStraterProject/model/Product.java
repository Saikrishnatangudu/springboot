package com.springBootStraterProject.model;

import java.io.Serializable;

public class Product implements Serializable {

	private int productId;

	private String productName;

	private float cost;

	public Product() {

		super();

	}

	public Product(int productId, String productName, float cost) {

		super();

		this.productId = productId;

		this.productName = productName;

		this.cost = cost;

	}

	public int getProductId() {

		return productId;

	}

	public void setProductId(int productId) {

		this.productId = productId;

	}

	public String getProductName() {

		return productName;

	}

	public void setProductName(String productName) {

		this.productName = productName;

	}

	public float getCost() {

		return cost;

	}

	public void setCost(float cost) {

		this.cost = cost;

	}

	@Override

	public String toString() {

		return "Product [productId=" + productId + ", productName=" + productName + ", cost=" + cost + "]";

	}

}
