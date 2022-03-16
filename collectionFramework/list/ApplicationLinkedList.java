package com.te.learn.collectionFramework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ApplicationLinkedList {
	public static void main(String[] args) {
		LinkedList<Student> linkedList=new LinkedList();
		linkedList.add(new Student(01, "Student1", 21));
		linkedList.add(new Student(02, "Student2", 22));
		linkedList.add(new Student(03, "Student3", 23));
		System.out.println("1 - Using for");
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println(linkedList.get(i));
		}
		System.out.println("2 - Using for each");
		for (Object object : linkedList) {
			System.out.println(object);
		}
		System.out.println("3 - Using Iterator");
		Iterator iterator=linkedList.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		System.out.println("4 - using ListIterator");
		ListIterator iteratoListIterator=linkedList.listIterator();
		while(iteratoListIterator.hasNext())
			System.out.println(iteratoListIterator.next());
		
	}
}
