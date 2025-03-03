package com.demo;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Mobile {
	@Id
	int id;
	String companey;
	int price;
	public Mobile() {
		super();
	}
	public Mobile(int id, String companey, int price) {
		super();
		this.id = id;
		this.companey = companey;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompaney() {
		return companey;
	}
	public void setCompaney(String companey) {
		this.companey = companey;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", companey=" + companey + ", price=" + price + "]";
	}
	
	
}
