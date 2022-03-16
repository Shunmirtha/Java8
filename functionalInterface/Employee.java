package com.te.learn.functionalInterface;

public class Employee {
	private int eAge;
	private String eName;
	private long salary;
	public Employee() {
		super();
	}
	public Employee(int eAge, String eName, long salary) {
		super();
		this.eAge = eAge;
		this.eName = eName;
		this.salary = salary;
	}
	public int geteAge() {
		return eAge;
	}
	public void seteAge(int eAge) {
		this.eAge = eAge;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eAge=" + eAge + ", eName=" + eName + ", salary=" + salary + "]";
	}
	
}
