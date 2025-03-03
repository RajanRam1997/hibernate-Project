package com.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Laptop {
	@Id
	@GeneratedValue(generator = "increment")
	int id;
	
	String model;
	String color;
	int price;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(int id, String model, String color, int price) {
		super();
		this.id = id;
		this.model = model;
		this.color = color;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", model=" + model + ", color=" + color + ", price=" + price + "]";
	}
	
	
}
