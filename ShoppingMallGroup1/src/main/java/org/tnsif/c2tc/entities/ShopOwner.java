package org.tnsif.c2tc.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="shopowners")
public class ShopOwner
{
	@Id
	private long shopownerid;
	private String shopownername;
	private String shopaddress;
	private LocalDate shopownerdateob;
	private String shopownershopname;
	public long getShopownerid() {
		return shopownerid;
	}
	public void setShopownerid(long shopownerid) {
		this.shopownerid = shopownerid;
	}
	public String getShopownername() {
		return shopownername;
	}
	public void setShopownername(String shopownername) {
		this.shopownername = shopownername;
	}
	public String getShopaddress() {
		return shopaddress;
	}
	public void setShopaddress(String shopaddress) {
		this.shopaddress = shopaddress;
	}
	public LocalDate getShopownerdateob() {
		return shopownerdateob;
	}
	public void setShopownerdateob(LocalDate shopownerdateob) {
		this.shopownerdateob = shopownerdateob;
	}
	public String getShopownershopname() {
		return shopownershopname;
	}
	public void setShopownershopname(String shopownershopname) {
		this.shopownershopname = shopownershopname;
	}
	
}
