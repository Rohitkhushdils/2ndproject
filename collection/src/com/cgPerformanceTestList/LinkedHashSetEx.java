package com.cgPerformanceTestList;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {

		public static void main(String[] args) {
			LinkedHashSet<String> s1=new LinkedHashSet<String>();
			s1.add("Rohit");
			s1.add("Rahul");
			s1.add("Mohan");
			s1.add("Rohit");
			s1.add("Ramesh");
			s1.add("Mohit");
			System.out.println(s1);// here the order is sorted acc to our input and still no duplicates.
			

		}
	}


