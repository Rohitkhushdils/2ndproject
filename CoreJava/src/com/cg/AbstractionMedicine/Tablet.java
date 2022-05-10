package com.cg.AbstractionMedicine;

public class Tablet extends Medicine {
		public Tablet() {
		}
		public void getDetails() {
			System.out.println("price of the medicine is "+price+"per tablet and expiry of this"+exp_date+".");
		}
		
	public Tablet(int price, float exp_date) {
		super(price, exp_date);
		// TODO Auto-generated constructor stub
	}


	@Override
	void displayLabel() {
		// TODO Auto-generated method stub
		
	}
	

	
		
		
		
		
		
	

	
	
	

}
