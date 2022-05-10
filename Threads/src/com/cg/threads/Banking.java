package com.cg.threads;

public class Banking implements Runnable {
float balanceAmt=5000;
	
	
	public void run() {
		debit(4000);
	}

	synchronized void  debit(int debitAmt) {
		Thread t=Thread.currentThread();
		if(balanceAmt>=debitAmt) {
			System.out.println(t.getName() +" ready to debit");
			balanceAmt=balanceAmt-debitAmt;
			System.out.println(t.getName()+" Successfully debited");
		}
		else {
			System.out.println(t.getName()+" insufficient funds .....");
		}
	}

	public float getBalanceAmt() {
		return balanceAmt;
	}
	
	
	

}
