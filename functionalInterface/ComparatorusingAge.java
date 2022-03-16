package com.te.learn.functionalInterface;

import java.util.Comparator;

public class ComparatorusingAge implements Comparator{
	//Employee e1=new 
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employee e1=(Employee) o1;
		Employee e2=(Employee) o2;
		if(e1.geteAge()>e2.geteAge())
		{
			return 1;
		}
		else if (e1.geteAge()<e2.geteAge()) {
			return -1;
		}
		return 0;
	}
	
	
}
