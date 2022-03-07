package com.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PositiveOrZero;

import org.springframework.stereotype.Component;

@Component
public class BookRestaurant {
	
	@NotEmpty(message = "{error.customerName.blank}") 
	private String customerName;
	@NotEmpty(message = "{error.contactNumber.blank}") 
	private String contactNumber;
	private String hallType;
	@PositiveOrZero(message="{error.adultCount.forVeg.positive}")
	private int adultVegCount;
	@PositiveOrZero(message="{error.kidsCount.forVeg.positive}")
	private int kidsVegCount;
	@PositiveOrZero(message="{error.adultCount.forNonVeg.positive}")
	private int adultNonVegCount;
	@PositiveOrZero(message="{error.kidsCount.forNonVeg.positive}")
	private int kidsNonVegCount;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getHallType() {	 	  	    	    		        	 	
		return hallType;
	}
	public void setHallType(String hallType) {
		this.hallType = hallType;
	}
	public int getAdultVegCount() {
		return adultVegCount;
	}
	public void setAdultVegCount(int adultVegCount) {
		this.adultVegCount = adultVegCount;
	}
	public int getKidsVegCount() {
		return kidsVegCount;
	}
	public void setKidsVegCount(int kidsVegCount) {
		this.kidsVegCount = kidsVegCount;
	}
	public int getAdultNonVegCount() {
		return adultNonVegCount;
	}
	public void setAdultNonVegCount(int adultNonVegCount) {
		this.adultNonVegCount = adultNonVegCount;
	}
	public int getKidsNonVegCount() {
		return kidsNonVegCount;
	}
	public void setKidsNonVegCount(int kidsNonVegCount) {
		this.kidsNonVegCount = kidsNonVegCount;
	}
	
	
	

}
	 	  	    	    		        	 	
