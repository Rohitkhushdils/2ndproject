package com.cg.Abstraction;

public class Car extends Vehicle {
	boolean ac;

	public Car(boolean ac,int regno, String vehiclename, int milege, double price) {
		super(regno, vehiclename, milege, price);
		this.ac = ac;
	}

	@Override
	void drive() {
		// TODO Auto-generated method stub
		System.out.println("Properties of car "  +"regno "  +"milege");
		
	}
	
	

}
