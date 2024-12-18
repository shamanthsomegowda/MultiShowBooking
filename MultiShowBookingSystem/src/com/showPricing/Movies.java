package com.showPricing;

public class Movies extends MultiShowPricing{
	private boolean isStudent;
	private double studentDiscountInPercent;
	private double bulkDiscountInPercent;

	public Movies(String showTitle, String showType, String ticketType, int ticketPriceInRs, int ticketQuantity, int studentDiscountInPercent, int bulkDiscountInPercent, boolean isStudent) {		
		
		super(showTitle, showType, ticketType, ticketPriceInRs, ticketQuantity);
		this.bulkDiscountInPercent=bulkDiscountInPercent;
		this.studentDiscountInPercent=studentDiscountInPercent;
		this.isStudent=isStudent;
		super.singleTicketPrice=calculateSingleTicketPrice();
	}

	@Override
	public double calculateSingleTicketPrice(){
		if(isStudent) {
			singleTicketPrice = ticketPriceInRs - ticketPriceInRs*(studentDiscountInPercent/100);
		}
		if(ticketQuantity>=5) {
			singleTicketPrice = ticketPriceInRs - ticketPriceInRs*(bulkDiscountInPercent/100);
		}
		return singleTicketPrice;
	}


}
