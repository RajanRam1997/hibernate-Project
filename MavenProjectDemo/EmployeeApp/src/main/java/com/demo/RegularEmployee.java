package com.demo;
public class RegularEmployee extends Employee {
 private int salary;
 private int bonus;
 
 
 public RegularEmployee(int salary, int bonus) {
	super();
	this.salary = salary;
	this.bonus = bonus;
}
public RegularEmployee() {
	super();
	// TODO Auto-generated constructor stub
}
public RegularEmployee(int id, String name) {
	super(id, name);
	// TODO Auto-generated constructor stub
}
public int getSalary() {
  return salary;
 }
 public void setSalary(int salary) {
  this.salary = salary;
 }
 public int getBonus() {
  return bonus;
 }
 public void setBonus(int bonus) {
  this.bonus = bonus;
 }
@Override
public String toString() {
	return "RegularEmployee [salary=" + salary + ", bonus=" + bonus + "]";
}
 
}