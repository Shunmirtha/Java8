package com.te.learn.threadRunable;

import com.te.learn.threadDemo.MyIntThread2;

public class Application {
	 public static void main(String[] args) {
		Thread thread=new Thread(new MyCharThread());
		Thread thread2=new Thread(new MyIntThread2());
		MyCharThread mt=new MyCharThread();
		mt.run();
		thread.start();
		thread2.start();
	}
}
