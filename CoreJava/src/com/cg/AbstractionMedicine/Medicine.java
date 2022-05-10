package com.cg.AbstractionMedicine;

public abstract class Medicine {
	 int price;
	 float exp_date;
	
	public void getDetails()
	{
		System.out.println("price of the medicine is "+price+"per tablet and expiry of this"+exp_date+".");
		
	}

	public Medicine(int price, float exp_date) {
		super();
		this.price = price;
		this.exp_date = exp_date;
	}	
	public Medicine(){
		// TODO Auto-generated constructor stub
	}

	abstract void displayLabel();
	
	

	}
