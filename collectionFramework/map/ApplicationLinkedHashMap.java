package com.te.learn.collectionFramework.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class ApplicationLinkedHashMap {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hashMap=new LinkedHashMap<Integer, String>();
		hashMap.put(9, "P1");
		hashMap.put(8, "P2");
		hashMap.put(9, "P0");
		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			System.out.println("Key : "+entry.getKey()+"  Value : "+ entry.getValue());
			
		}
	}
}