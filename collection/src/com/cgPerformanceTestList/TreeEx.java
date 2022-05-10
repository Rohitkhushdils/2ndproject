package com.cgPerformanceTestList;

import java.util.TreeSet;
	public class TreeEx {

		public static void main(String[] args) {
			TreeSet<String> s1=new TreeSet<String>();
			s1.add("Rohit");
			s1.add("Rahul");
			s1.add("Mohan");
			s1.add("Rohit");
			s1.add("Ramesh");
			s1.add("Mohit");
			System.out.println(s1);// here the order is sorted acc to their ascii values and still no duplicates.
			// In LinkedHashset order is same as we entered.

		}
	}
