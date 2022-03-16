package com.te.learn.collectionFramework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ApplicaationArrayList {
	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList();
		arrayList.add(new Student(01, "Student1", 21));
		arrayList.add(new Student(02, "Student2", 22));
		arrayList.add(new Student(03, "Student3", 23));
		System.out.println("1 - using for");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		System.out.println("2 - using for each");
		for (Object object : arrayList) {
			System.out.println(object);
		}
		System.out.println("3 - using Iterator");
		Iterator iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("4 - using Iterator");
		ListIterator listIterator = arrayList.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
	}
}
