package com.cg.threads;

public class MainThreadEx1 {
	public static void main(String[] args) {
		System.out.println("Main thread starts");//main thread
		Thread.currentThread().setPriority(1);
		FileDownloaderEx1 Downloader = new FileDownloaderEx1();// child thread
		Thread t =new Thread(Downloader);//thread start state
		t.start();//runnable state
		t.setPriority(10);
		System.out.println("main thread ends");
	}

}
