package com.cg.threads;

public class MyTask12 implements Runnable {
	int data = 99;

	@Override
	public void run() {
		data=data+10;	
	}
	int getdata() {
	return data;

}
}
