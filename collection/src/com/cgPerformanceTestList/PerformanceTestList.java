package com.cgPerformanceTestList;


	import java.util.ArrayList;
	import java.util.LinkedList;

	public class PerformanceTestList {
	public static void main(String[] args) {
		ArrayList<String> list1= new ArrayList<String>();
		
		long t1=System.currentTimeMillis(); //returns the current time in millisecs
		for(int i=1;i<=1000000;i++) {
			list1.add("hello");
		}
		long t2=System.currentTimeMillis();
		System.out.println("Time took for ArrayList : "+(t2-t1));
		
		LinkedList<String> list2= new LinkedList<String>();
		t1=System.currentTimeMillis(); //returns the current time in millisecs
		for(int i=1;i<=1000000;i++) {
			list2.add("hello");
		}
		t2=System.currentTimeMillis();
		System.out.println("Time took for LinkedList : "+(t2-t1));
	}
	}



