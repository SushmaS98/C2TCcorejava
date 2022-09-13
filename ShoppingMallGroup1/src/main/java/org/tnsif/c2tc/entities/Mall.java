package org.tnsif.c2tc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="malls")
public class Mall 
{
	@Id
	private long id;
	private String mallAdmin;
	private String mallName;
	private String location;
	private String shop;
	//private enum categories{REGIONAL,SUPERREGIONAL};

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMallAdmin() {
		return mallAdmin;
	}
	public void setMallAdmin(String mallAdmin) {
		this.mallAdmin = mallAdmin;
	}
	public String getShop() {
		return shop;
	}
	public void setShop(String shop) {
		this.shop = shop;
	}
	
}
