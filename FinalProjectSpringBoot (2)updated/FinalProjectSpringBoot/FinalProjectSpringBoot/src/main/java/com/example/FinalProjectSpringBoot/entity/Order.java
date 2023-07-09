package com.example.FinalProjectSpringBoot.entity;

//Hibernate Persistence class
//Employee.java file
//creating Order persistence class(table)
import jakarta.persistence.*;

@Entity
public class Order {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)


//ordername
//quantity
//person name
//address
//mob no
//price
private int orderId;
private String menu;
private static int qty;
private String customerName;
private String address;
private static int mobile;
private static int price;


public Order(int orderId, String menu, int qty, String customerName, String address, int mobile, int price) {
	super();
	this.orderId = orderId;
	this.menu = menu;
	this.qty = qty;
	this.customerName = customerName;
	this.address = address;
	this.mobile = mobile;
	this.price = price;
}

public Order() {
	
}

public int getOrderId() {
	return orderId;
}

public void setOrderId(int orderId) {
	this.orderId = orderId;
}

public String getMenu() {
	return menu;
}

public void setMenu(String menu) {
	this.menu = menu;
}

public static int getQty() {
	return qty;
}

public void setQty(int qty) {
	this.qty = qty;
}

public String getCustomerName() {
	return customerName;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public static int getMobile() {
	return mobile;
}

public void setMobile(int mobile) {
	this.mobile = mobile;
}

public static int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}


}




