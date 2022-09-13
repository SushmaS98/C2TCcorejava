package org.tnsif.c2tc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="shop")
public class Shop 
{
	@Id
	private long shopId;
	private String shopEmployees; 
	private String shopName;
	private String customersname;
	private String shopOwner;
	//private Lease leaseStatus;
	//private enum shopCategory{ WHOLESALE , RETAIL };
	//private enum shopStatus{ OPEN , CLOSED};
	
	public long getShopId() {
		return shopId;
	}
	public void setShopId(long shopId) {
		this.shopId = shopId;
	}
	public String getShopEmployees() {
		return shopEmployees;
	}
	public void setShopEmployees(String shopEmployees) {
		this.shopEmployees = shopEmployees;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getCustomersname() {
		return customersname;
	}
	public void setCustomersname(String customersname) {
		this.customersname = customersname;
	}
	public String getShopOwner() {
		return shopOwner;
	}
	public void setShopOwner(String shopOwner) {
		this.shopOwner = shopOwner;
	}
	/*public Lease getLeaseStatus() {
		return leaseStatus;
	}
	public void setLeaseStatus(Lease leaseStatus) {
		this.leaseStatus = leaseStatus;
	}*/
	

}
