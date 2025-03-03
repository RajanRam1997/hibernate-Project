package com.demo;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Car {
	
	@Id
	int id;
	String model;
	String color;
	float price;
	
	
	public Car() {
		super();
	}
	Car(int id, String model, String color, float price){
		this.id=id;
		this.model=model;
		this.color=color;
		this.price=price;
	}
	public String toString() {
		
		return id+model;
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
