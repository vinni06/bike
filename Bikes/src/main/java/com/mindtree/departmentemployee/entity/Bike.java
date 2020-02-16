package com.mindtree.departmentemployee.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Bike {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bikeId;
	private String bikeName;
	private double bikePrice;
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Bike(int bikeId, String bikeName, double bikePrice) {
		super();
		this.bikeId = bikeId;
		this.bikeName = bikeName;
		this.bikePrice = bikePrice;
	}

	public int getBikeId() {
		return bikeId;
	}
	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}
	public String getBikeName() {
		return bikeName;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	@Override
	public String toString() {
		return "Bike [bikeId=" + bikeId + ", bikeName=" + bikeName + "]";
	}

	public double getBikePrice() {
		return bikePrice;
	}

	public void setBikePrice(double bikePrice) {
		this.bikePrice = bikePrice;
	}
	
	
	
	
	
	
	
}
