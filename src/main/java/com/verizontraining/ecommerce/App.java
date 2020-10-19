package com.verizontraining.ecommerce;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Notification notification = new Container().lookup("");
       Order order = new Order("CUST345","Cricket Bat", notification);
       order.placeOrder();
    }
}
