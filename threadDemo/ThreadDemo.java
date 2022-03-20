package com.te.learn.threadDemo;

public class ThreadDemo {
	public static void main(String[] args) {
		System.out.println("Main start...");
		MyCharThread charThread=new MyCharThread();
		MyIntThread2 intThread2=new MyIntThread2();
		intThread2.start();
		charThread.start();
		
		System.out.println("Main ends....");
	}
}
