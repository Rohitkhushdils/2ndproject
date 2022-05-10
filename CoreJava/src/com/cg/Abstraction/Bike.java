package com.cg.Abstraction;

public class Bike extends Vehicle {
	boolean seatsplit;

	public Bike(boolean seatsplit,int regno, String vehiclename, int milege, double price) {
		super( regno,  vehiclename, milege,  price);
		this.seatsplit = seatsplit;
	}

	@Override
	void drive() {
		// TODO Auto-generated method stub
		System.out.println("Bike drives at the speed of"+Vehiclename+"km/hr");
		
	}

	
	}
	

