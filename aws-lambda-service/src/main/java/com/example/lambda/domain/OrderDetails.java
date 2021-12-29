package com.example.lambda.domain;

public class OrderDetails {

	private int productId;
    private String productName;
    private double cost;
    private int quantity;
    
	@Override
	public String toString() {
		return "OrderDetails [productId=" + productId + ", productName=" + productName + ", cost=" + cost
				+ ", quantity=" + quantity + "]";
	}

	
	public OrderDetails() {
		// TODO Auto-generated constructor stub
	}


	public OrderDetails(int productId, String productName, double cost, int quantity) {
		
		this.productId = productId;
		this.productName = productName;
		this.cost = cost;
		this.quantity = quantity;
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
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
        
}
