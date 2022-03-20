package com.te.learn.threadRunnableUsingLambda;

public class App {
	public static void main(String[] args) {
		Thread thread=new Thread(new Story());
		thread.start();
	}
}
