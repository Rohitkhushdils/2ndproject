package com.cg.threads;

public class MainThreadEx {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println("Current thread is " +t.getName());
		t.setPriority(9);
		System.out.println(t.getPriority());
		for(int i=1;i<20;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		
	}

}
}

