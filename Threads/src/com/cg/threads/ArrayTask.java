package com.cg.threads;

public class ArrayTask implements Runnable {
	private int arr[];

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	@Override
	public void run() {
		Thread t=Thread.currentThread();
		for (int a: arr) {
			System.out.println(a +" "+t.getName());
		}
		
		
	}

}
