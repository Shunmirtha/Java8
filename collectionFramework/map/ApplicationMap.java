package com.te.learn.collectionFramework.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ApplicationMap {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "S1");
		hashMap.put(2, "S2");
		hashMap.put(2, "S3");
		hashMap.put(3, "S3");
		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			System.out.println("Key : " + entry.getKey() + "  Value : " + entry.getValue());

		}

	}
}
