package com.cgPerformanceTestList;
import java.util.HashSet;

public class SetEx1 {
	public static void main(String[] args) {
		HashSet<String> s1=new HashSet<String>();
		s1.add("Rohit");
		s1.add("Rahul");
		s1.add("Mohan");
		s1.add("Rohit");
		s1.add("Ramesh");
		s1.add("Mohit");
		System.out.println(s1);// So here data is sorted and no repeat is there.
		
	}

}
