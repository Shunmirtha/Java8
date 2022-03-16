package com.te.learn.collectionFramework.set;

import java.util.HashSet;

public class ApplicationHashSet2 {
	public static void main(String[] args) {
		HashSet<Student2> hashSet=new HashSet<Student2>();
		hashSet.add(new Student2(01, "Student1", 33));
		hashSet.add(new Student2(02, "Student2", 23));
		hashSet.add(new Student2(01, "Student1", 33));
		hashSet.add(new Student2(03, "Student3", 22));
		for (Student2 student2 : hashSet) {
			System.out.println(student2);
		}
		//to remove duplicate we have override hashcode and equals
	}
}
