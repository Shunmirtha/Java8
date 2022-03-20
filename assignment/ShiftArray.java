package com.te.learn.assignment;

public class ShiftArray {
	public static void main(String[] args) {
		int[] arr= {11,9,6,23,18,3};
		int max=-1;
		int secMax=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>secMax) {
			if(max<arr[i] ) {
				//secMax=max;
				max=arr[i];
				
			}
			
			}
		}
		System.out.println(secMax);
	}
}
