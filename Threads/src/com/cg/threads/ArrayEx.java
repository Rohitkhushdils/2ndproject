package com.cg.threads;

public class ArrayEx {
	public static void main(String[] args) {
		int arr[]= {3,4,5,4,3,44,33,22,33,3,5,6,66,55,76,77,76,65,54,43,32,31};
		ArrayTask task=new ArrayTask();
		task.setArr(arr);
		Thread t1=new Thread(task);
		Thread t3=new Thread(task);
		t1.setName("A");
		t3.setName("B");
		t1.start();
		t3.start();
		System.out.println("done");
		
	}

}
