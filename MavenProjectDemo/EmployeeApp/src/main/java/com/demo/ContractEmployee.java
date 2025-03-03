package com.demo;

public class ContractEmployee extends Employee {
 private int payperhour;
 private String duration;
 
 
 public ContractEmployee() {
	super();
	// TODO Auto-generated constructor stub
}
 
public ContractEmployee(int id,String name,int payperhour, String duration) {
	super(id,name);
	this.payperhour = payperhour;
	this.duration = duration;
}

public ContractEmployee(int id, String name) {
	super(id, name);
	// TODO Auto-generated constructor stub
}
public int getPayperhour() {
  return payperhour;
 }
 public void setPayperhour(int payperhour) {
  this.payperhour = payperhour;
 }
 public String getDuration() {
  return duration;
 }
 public void setDuration(String duration) {
  this.duration = duration;
 }

@Override
public String toString() {
	return "ContractEmployee [payperhour=" + payperhour + ", duration=" + duration + "]";
}
 
}