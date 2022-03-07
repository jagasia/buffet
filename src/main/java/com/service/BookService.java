package com.service;

import org.springframework.stereotype.Service;

import com.model.BookRestaurant;

@Service
public class BookService {
	
	public double calculateTotalCost(BookRestaurant book) {
		
		double cost=0.0;
		if(book.getHallType().equalsIgnoreCase("AC"))
		{
			cost = ((book.getAdultVegCount() * 599.0)+(book.getKidsVegCount() * 249.0)+ (book.getAdultNonVegCount() * 699.0)+(book.getKidsNonVegCount() * 349.0))+500.0;
		}
		else
		{
			cost = ((book.getAdultVegCount() * 599.0)+(book.getKidsVegCount() * 249.0)+ (book.getAdultNonVegCount() * 699.0)+(book.getKidsNonVegCount() * 349.0));
		}
		return cost;
		
	}

}
	 	  	    	    		        	 	
