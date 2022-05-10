package com.cg.collection;

import java.util.Vector;

public class VectorEx2 {
	public static void main(String[] args) {
		Vector<Product> v1= new Vector<Product>();
		Product p1 =new Product(111,"Shirt",300,4.5f);
		Product p2=new Product(121,"Bat",200,5.1f);
		Product p3=new Product(122,"Battery",20,5.5f);
		Product p4=new Product(102,"Matt",50,4.5f);
		Product p5=new Product(101,"Toffee",500,4.7f);
		v1.add(p1);
		v1.add(p2);
		v1.add(p3);
		v1.add(p4);
		v1.add(p5);
		for (Product p: v1) {
			System.out.println(p.getProdCode()+"/t"+p.getProdName()+"/t"+p.getPrice()+"/t"+p.getRatings()+"/t");
			
			
		}
		
		
		
		
		
	}

}
