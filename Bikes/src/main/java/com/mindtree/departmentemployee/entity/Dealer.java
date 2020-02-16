package com.mindtree.departmentemployee.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Dealer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int dealerId;
	private String dealerName;
	private String Address;
	@OneToMany
	List<Brand> brands;
	public Dealer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Dealer(int dealerId, String dealerName, String address, List<Brand> brands) {
		super();
		this.dealerId = dealerId;
		this.dealerName = dealerName;
		Address = address;
		this.brands = brands;
	}


	public int getDealerId() {
		return dealerId;
	}
	public void setDealerId(int dealerId) {
		this.dealerId = dealerId;
	}
	public String getDealerName() {
		return dealerName;
	}
	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public List<Brand> getBrands() {
		return brands;
	}
	public void setBrands(List<Brand> brands) {
		this.brands = brands;
	}


	@Override
	public String toString() {
		return "Dealer [dealerId=" + dealerId + ", dealerName=" + dealerName + ", Address=" + Address + ", brands="
				+ brands + "]";
	}
	
	
	
	
}
