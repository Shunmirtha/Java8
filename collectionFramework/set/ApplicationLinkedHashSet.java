package com.te.learn.collectionFramework.set;

import java.util.LinkedHashSet;

public class ApplicationLinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<Student> linkedHashSet=new LinkedHashSet<Student>();
		linkedHashSet.add(new Student(01, "Student1", 33));
		linkedHashSet.add(new Student(02, "Student2", 23));
		linkedHashSet.add(new Student(01, "Student1", 33));
		linkedHashSet.add(new Student(03, "Student3", 22));
		for (Student student : linkedHashSet) {
			System.out.println(student);
		}
	}
}
