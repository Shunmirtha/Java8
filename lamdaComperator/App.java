package com.te.learn.lamdaComperator;


import java.util.Comparator;
import java.util.Scanner;

import com.te.learn.functionalInterface.Employee;

public class App {
	public static void main(String[] args) {
		int a;
		Employee1[] employee1s= {new Employee1(33,02, 90000, "Emp1"), 
										new Employee1(29, 01, 70000, "Emp2"), 
										new Employee1(40, 03, 10000, "Emp3") };
		Scanner s=new Scanner(System.in);
		System.out.println("1. Sorting based on Age");
		System.out.println("2. Sorting based on Employee Id");
		System.out.println("3. Sorting based on Salary");
		System.out.println("Enter the option to be performed :");
		a=s.nextInt();
		if(a==1) {
			System.out.println("Sorted based on Age");
			Comparator comparatorAge=(o1, o2) ->{
				Employee1 e1=(Employee1) o1;
				Employee1 e2=(Employee1) o2;
				if(e1.geteAge()>e2.geteAge())
				{
					return 1;
				}
				else if (e1.geteAge()<e2.geteAge()) {
					return -1;
				}
				return 0;
			};
			for (Employee1 employee1 : employee1s) {
				System.out.println(employee1);
			}
			
		}
		if(a==2)
		{
			System.out.println("Sorted based on Employee Id");
			Comparator comparatorEmpId=(o1, o2) ->{
				Employee1 e1=(Employee1) o1;
				Employee1 e2=(Employee1) o2;
				if(e1.geteId()>e2.geteId())
				{
					return 1;
				}
				else if (e1.geteId()<e2.geteId()) {
					return -1;
				}
				return 0;
			};
			for (Employee1 employee1 : employee1s) {
				System.out.println(employee1);
			}
		}
		if(a==3)
		{
			System.out.println("Sorted based on Salary");
			Comparator comparatorEmpId=(o1, o2) ->{
				Employee1 e1=(Employee1) o1;
				Employee1 e2=(Employee1) o2;
				if(e1.geteSalary()>e2.geteSalary())
				{
					return 1;
				}
				else if (e1.geteSalary()<e2.geteSalary()) {
					return -1;
				}
				return 0;
			};
			for (Employee1 employee1 : employee1s) {
				System.out.println(employee1);
			}
		}
		
	}
}
