package com.te.learn.threadRunable;

import com.te.learn.threadDemo.MyIntThread2;

public class Application2 {
	public static void main(String[] args) {
		System.out.println("Main Starts..");
		Thread thread=new Thread(new Read());
		Thread thread2=new Thread(new Write());
		thread.start();
		thread2.start();
		System.out.println("Ends.......");
	}

}
