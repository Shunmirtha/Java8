package com.te.learn.collectionFramework.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class ApplicationTreeMap {
	public static void main(String[] args) {
		Comparator comparator = (o1, o2) -> {
			Integer integer = (Integer) o1;
			Integer integer2 = (Integer) o2;
			if (integer < integer2)
				return 1;
			if (integer > integer2)
				return -1;
			return 0;

		};
		
		TreeMap<Integer, Student> treemap = new TreeMap<Integer, Student>(comparator);
		treemap.put(1, new Student(01, "S1", 21));
		treemap.put(2, new Student(03, "S2", 22));
		treemap.put(2, new Student(06, "S3", 24));
		treemap.put(3, new Student(07, "S4", 22));
		for (Map.Entry<Integer, Student> entry : treemap.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());

		}
	}
}
