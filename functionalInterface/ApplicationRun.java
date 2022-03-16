package com.te.learn.functionalInterface;

import java.util.Arrays;
import java.util.Comparator;//Comparator is from util package
							//Comparable is from lang package

public class ApplicationRun {
	public static void main(String[] args) {
		Employee[] employees= {new Employee(44, "emp1", 10000), 
									new Employee(42, "emp2", 12000), new Employee(43, "emp3", 9000)};
		Comparator comparatorSalary=(o1, o2) ->{
			Employee e1=(Employee) o1;
			Employee e2=(Employee) o2;
			if(e1.getSalary()>e2.getSalary())
			{
				return 1;
			}
			else if (e1.getSalary()<e2.getSalary()) {
				return -1;
			}
			return 0;
		};// using lamnda (can be used only in functional Interface
		Arrays.sort(employees, new ComparatorusingAge());
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		System.out.println("Based Salary Sorted");
		Arrays.sort(employees, comparatorSalary);
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
	}
}
