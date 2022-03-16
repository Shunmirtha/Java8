package com.te.learn.threadRunable;

public class MyIntThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int c=1; c<=16; c++)
		{
			System.out.println("Integer : "+ c);
		}
	}
	

}
