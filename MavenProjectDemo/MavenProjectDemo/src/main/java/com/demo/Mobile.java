package com.demo;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mobile {
 
 @Id
 int mid;
 String company;
 float price;
 public int getMid() {
  return mid;
 }
 public void setMid(int mid) {
  this.mid = mid;
 }
 public String getCompany() {
  return company;
 }
 public void setCompany(String company) {
  this.company = company;
 }
 public float getPrice() {
  return price;
 }
 public void setPrice(float price) {
  this.price = price;
 }
 public Mobile(int mid, String company, float price) {
  super();
  this.mid = mid;
  this.company = company;
  this.price = price;
 }
 public Mobile() {
  super();
 }
 
 @Override
 public String toString() {
  return "Mobile [mid=" + mid + ", company=" + company + ", price=" + price + "]";
 }
}
