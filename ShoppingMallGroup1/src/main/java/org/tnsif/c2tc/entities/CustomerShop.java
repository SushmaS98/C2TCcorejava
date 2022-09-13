package org.tnsif.c2tc.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customershop ")
public class CustomerShop 
{
	@Id
	private int id;
	private String name;
	private LocalDate manufacturing;
	private LocalDate expiry;
	private float price;
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
	public LocalDate getManufacturing() {
		return manufacturing;
	}
	public void setManufacturing(LocalDate manufacturing) {
		this.manufacturing = manufacturing;
	}
	public LocalDate getExpiry() {
		return expiry;
	}
	public void setExpiry(LocalDate expiry) {
		this.expiry = expiry;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	

}
