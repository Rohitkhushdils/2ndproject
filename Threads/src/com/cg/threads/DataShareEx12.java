package com.cg.threads;

public class DataShareEx12 {
	public static void main(String[] args) throws InterruptedException {
	MyTask12 task=new MyTask12();
	Thread t1=new Thread(task);
	Thread t2=new Thread(task);
	t1.start();//runnable
	t2.start();//runnable
	// here main thread should wait for the other threads to complete the work
	t1.join();
	t2.join();// joins lgane sey main thread wait krega ki other thread apna kaam complete krr ley.
	// main thread get the computation result from the other threads
	
	System.out.println(task.getdata());
	

	
	
	

}
}
