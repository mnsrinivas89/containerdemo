package com.verizontraining.ecommerce;

public class Container {

	private Notification notify;
	
	public Notification lookup(String notificationType) {
		switch (notificationType) {
		case "EMAIL":
			this.notify = new EmailNotificationImpl();
			break;
		case "SMS":
			this.notify = new SMSNotificationImpl();
			break;
		default:
			this.notify = new PushNotificationImpl();
		}
		return this.notify;
	}
}
