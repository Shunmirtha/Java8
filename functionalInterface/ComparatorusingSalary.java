package com.te.learn.functionalInterface;

import java.util.Comparator;

public class ComparatorusingSalary implements Comparator{
	//Employee e1=new 
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
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
	}
	
	
}
