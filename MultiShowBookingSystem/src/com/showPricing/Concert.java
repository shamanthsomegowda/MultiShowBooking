package com.showPricing;

public class Concert extends MultiShowPricingCalculator{
	private double eventHandleSurchargeInPercent;

	public Concert(String showTitle, String showType, String ticketType, int ticketPriceInRs, int ticketQuantity, int eventHandleSurchargeInPercent) {		
		super(showTitle, showType, ticketType, ticketPriceInRs, ticketQuantity);
		this.eventHandleSurchargeInPercent=eventHandleSurchargeInPercent;
		super.singleTicketPrice=calculateSingleTicketPrice();
	}

	/** returns the cost of single ticket after including the applicable surcharge and discounts */
	@Override
	public double calculateSingleTicketPrice(){
		singleTicketPrice = ticketPriceInRs + ticketPriceInRs*(eventHandleSurchargeInPercent/100);
		return singleTicketPrice;
	}


}
