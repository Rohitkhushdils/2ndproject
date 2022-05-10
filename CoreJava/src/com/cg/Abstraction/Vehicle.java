package com.cg.Abstraction;

public  abstract class Vehicle {
	int Regno;
	String Vehiclename;
	int Milege;
	double Price;
	
	abstract void drive();
	

	public Vehicle(int regno, String vehiclename, int milege, double price) {
		super();
		Regno = regno;
		Vehiclename = vehiclename;
		Milege = milege;
		Price = price;
	}

	
	
	
	

}
