package com.te.learn.threadRunable;

public class MyCharThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(char c='a'; c<='z'; c++)
		{
			System.out.println("Character : "+ c);
		}
		
	}

}
