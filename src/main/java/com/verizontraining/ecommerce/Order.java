package com.verizontraining.ecommerce;

public class Order {

	private String customerId;
	private String item;
	private Notification notification;
	
	public Order(String customerId, String item, Notification notification) {
		this.customerId = customerId;
		this.item = item;
		this.notification = notification;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	
	public void placeOrder() {
		System.out.println("Order has been place");
		this.notification.sendNotification();
	}
	
	
}
