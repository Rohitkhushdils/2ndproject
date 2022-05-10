package com.cgArrayTestList;
import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[]args) {
	ArrayList<Integer> a1=new ArrayList<Integer>();
   a1.add(10);
   a1.add(20);
   a1.add(30);
   a1.add(40);
   for (int i : a1) {
	   System.out.println(i);
   }
 
	}
}
