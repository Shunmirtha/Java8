package com.te.learn.collectionFramework.set;

import java.util.HashSet;

public class ApplicationHashSet {
	public static void main(String[] args) {
		HashSet<Integer> hashSet=new HashSet<Integer>();
		hashSet.add(1);
		hashSet.add(1);
		hashSet.add(3);
		hashSet.add(2);
		hashSet.add(3);
		hashSet.add(8);

		for (Integer integer : hashSet) {
			System.out.println(integer);
		}
	}
}
