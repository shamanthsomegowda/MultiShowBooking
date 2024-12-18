package com.showPricing;

public abstract class MultiShowPricing {
	
	protected String showTitle;
	protected String showType;
	protected String ticketType;
	protected double ticketPriceInRs;
	protected int ticketQuantity;
	protected double singleTicketPrice;
	protected double totalCost;
	
	public MultiShowPricing(String showTitle, String showType, String ticketType, int ticketPriceInRs, int ticketQuantity) {
		this.showTitle = showTitle;
		this.showType = showType;
		this.ticketType = ticketType;
		this.ticketQuantity = ticketQuantity;
		this.ticketPriceInRs = ticketPriceInRs;
	}
	
	
	public abstract double calculateSingleTicketPrice();
	
	public double calculateTotalCost() {
		totalCost = singleTicketPrice*ticketQuantity;	
		System.out.println("Total Cost for "+showType+"-"+showTitle+" show: "+totalCost);
		return totalCost;
	}

}
