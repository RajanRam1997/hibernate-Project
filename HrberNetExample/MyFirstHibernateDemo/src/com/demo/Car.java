package com.demo;

public class Car {
	
	int carid;
	String carmodel;
	String color;
	float price;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(int carid, String carmodel, String color, float price) {
		super();
		this.carid = carid;
		this.carmodel = carmodel;
		this.color = color;
		this.price = price;
	}
	public int getCarid() {
		return carid;
	}
	public void setCarid(int carid) {
		this.carid = carid;
	}
	public String getCarmodel() {
		return carmodel;
	}
	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
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
		return "Car [carid=" + carid + ", carmodel=" + carmodel + ", color=" + color + ", price=" + price + "]";
	}
	
}
