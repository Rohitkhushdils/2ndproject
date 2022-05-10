package com.cg.collection;
import java.util.Vector;

public class VectorEx {
	public static void main(String[]args) {
		Vector<Integer> v1=new Vector<Integer>();
		System.out.println("initial capacity "+v1.capacity());// whenever the limit of vector
															 //arr crossed the limit will doublled
		v1.add(10);
		v1.add(20);
		v1.add(30);
		System.out.println(v1);
		
		
		
	}

}
