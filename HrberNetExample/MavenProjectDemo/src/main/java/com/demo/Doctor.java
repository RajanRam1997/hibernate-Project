package com.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Doctor {
	@Id
	private int id;
	private String name;
	private String address;
	private float salary;
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(int id, String name, String address, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getMobile() {
		return salary;
	}
	public void setMobile(float mobile) {
		this.salary = mobile;
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", address=" + address + ", salary=" +salary + "]";
	}
	
}
