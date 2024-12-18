package com.showPricing;

public class Theatre extends MultiShowPricing {
	private boolean isSeniorCitizen;
	private double seniorCitizenDiscountInPercent;
	private int premiumSurcharge;

	public Theatre(String showTitle, String showType, String ticketType, int ticketPriceInRs, int ticketQuantity, int seniorCitizenDiscountInPercent, int premiumSurcharge, boolean isSeniorCitizen) {		

		super(showTitle, showType, ticketType, ticketPriceInRs, ticketQuantity);
		this.premiumSurcharge=premiumSurcharge;
		this.seniorCitizenDiscountInPercent=seniorCitizenDiscountInPercent;
		this.isSeniorCitizen=isSeniorCitizen;
		super.singleTicketPrice=calculateSingleTicketPrice();
	}

	@Override
	public double calculateSingleTicketPrice(){
		if(isSeniorCitizen) {
			singleTicketPrice = ticketPriceInRs - ticketPriceInRs*(seniorCitizenDiscountInPercent/100);
		}if(ticketType.equalsIgnoreCase("premium")) {
			singleTicketPrice += premiumSurcharge;
		}
		return singleTicketPrice;
	}


}
