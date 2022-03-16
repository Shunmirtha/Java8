package com.te.learn.threadDemo;

public class MyCharThread extends Thread{
	@Override
	public void run() {
		for(char c='a'; c<='z'; c++)
		{
			System.out.println("Character : "+ c);
		}
	}
	
}
