package com.te.learn.collectionFramework.set;

import java.util.Comparator;
import java.util.TreeSet;

public class ApplicationTreeSet {
	public static void main(String[] args) {
		TreeSet<Student3> set=new TreeSet<Student3>();
		set.add(new Student3(01, "Student1", 33));
		set.add(new Student3(02, "Student2", 23));
		set.add(new Student3(01, "Student1", 33));
		set.add(new Student3(03, "Student3", 22));
		System.out.println("Using Comparable....................");
		for (Student3 student3 : set) {
			System.out.println(student3);
		}
		System.out.println("Using Comparator....................");

		Comparator byAge=(o1, o2) -> {
			Student student=(Student) o1;
			Student student2=(Student) o2;
			if(student.getAge()>student2.getAge())
				return 1;
			if(student.getAge()<student2.getAge())
				return -1;
			return 0;
		};
		TreeSet<Student> set2= new TreeSet<Student>(byAge);
		set2.add(new Student(11, "Student1", 33));
		set2.add(new Student(12, "Student2", 23));
		set2.add(new Student(11, "Student1", 33));
		set2.add(new Student(13, "Student3", 22));
		for (Student student : set2) {
			System.out.println(student);
		}
	}
	
}
