package com.showPricing;

import java.util.HashMap;
import java.util.Map;

public abstract class MultiShowPricingCalculator {
	
	protected String showTitle;
	protected String showType;
	protected String ticketType;
	protected double ticketPriceInRs;
	protected int ticketQuantity;
	protected double singleTicketPrice;
	protected double totalCost;
	protected double cumulativeShowCost;
	static Map <String, Double> showsRevenue = new HashMap<String, Double>();
	
	public MultiShowPricingCalculator(String showTitle, String showType, String ticketType, int ticketPriceInRs, int ticketQuantity) {
		this.showTitle = showTitle;
		this.showType = showType;
		this.ticketType = ticketType;
		this.ticketQuantity = ticketQuantity;
		this.ticketPriceInRs = ticketPriceInRs;
	}
	
	/**
     * This method should be defined in all of the child classes
     * Implementation should calculate single ticket price considering the surcharge and discounts applicable
     * return price of single ticket in double primitive data type
     */
	public abstract double calculateSingleTicketPrice();
	
	/**calculates the total revenue collected for each show and returns the value */
	public double calculateTotalCost() {
		
		totalCost = singleTicketPrice*ticketQuantity;	
		System.out.println("Total Cost for "+showType+"-"+showTitle+" show: "+totalCost);
		
		//to store total collected amount based on the show type
		cumulativeShowCost = showsRevenue.getOrDefault(showType, 0.00)+totalCost;
		showsRevenue.put(showType, cumulativeShowCost);
		
		return totalCost;
	}

}
