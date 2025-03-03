package com.demo;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("regularemployee")
public class RegularEmployee extends Employee {
	private int salary;
	private int bonus;
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
	
	public RegularEmployee(int id, String name, int salary, int bonus) {
		super(id, name);
		this.salary = salary;
		this.bonus = bonus;
	}
	public RegularEmployee() {
		super();
	}
	@Override
	public String toString() {
		return "RegularEmployee [salary=" + salary + ", bonus=" + bonus + "]";
	}
	
	
}
