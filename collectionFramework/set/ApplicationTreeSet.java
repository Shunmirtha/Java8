package com.te.learn.collectionFramework.set;

import java.util.TreeSet;

public class ApplicationTreeSet {
	public static void main(String[] args) {
		TreeSet<Student> set=new TreeSet<Student>();
		set.add(new Student(01, "Student1", 33));
		set.add(new Student(02, "Student2", 23));
		set.add(new Student(01, "Student1", 33));
		set.add(new Student(03, "Student3", 22));
	}
}
