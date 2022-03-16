package com.te.learn.threadDemo;

public class MyIntThread extends Thread{
	@Override
	public void run() {
		for(int c=1; c<=16; c++)
		{
			System.out.println("Integer : "+ c);
		}
	}
	
}
