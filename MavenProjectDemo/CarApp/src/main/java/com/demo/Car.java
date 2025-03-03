package com.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "employee103")
public class Car {
	@Id
	int id;
	String model;
	String color;
	float price;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(int id, String model, String color, float price) {
		super();
		this.id = id;
		this.model = model;
		this.color = color;
		this.price = price;
	}
	public int getCarid() {
		return id;
	}
	public void setCarid(int carid) {
		this.id = carid;
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", color=" + color + ", price=" + price + "]";
	}
	
	
}
