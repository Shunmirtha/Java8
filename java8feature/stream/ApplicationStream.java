package com.te.learn.java8feature.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ApplicationStream {
	public static void main(String[] args) {
		ArrayList<Student> arrayList=new ArrayList<Student>();
		arrayList.add(new Student(19, 1, "Stu1"));
		arrayList.add(new Student(18, 2, "Stu2"));
		arrayList.add(new Student(20, 3, "Stu3"));
		List<Student> list=new ArrayList<Student>();
		for (Student student : arrayList) {
			if(student.getStudentAge()>=19) {
				list.add(student);
				//System.out.println(list);
			}
		}
		System.out.println(list);
		System.out.println("Using Stream===================================");
		list = arrayList.stream().filter(student -> student.getStudentAge()>=19).collect(Collectors.toList());
		System.out.println(list);
		System.out.println("Sorted List====================================");
		list = arrayList.stream().sorted().collect(Collectors.toList());
		System.out.println(list);
	}
}
