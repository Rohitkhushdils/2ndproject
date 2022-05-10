package com.cg.threads;

public class JoinEx {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main thread started");
		JoinTask task=new JoinTask();
		Thread t1=new Thread(task);
		t1.start();
		System.out.println("Iam Waiting");
		t1.join();//when we have join then main will wait for child.
		System.out.println("Main Thread ends");
	}

}
