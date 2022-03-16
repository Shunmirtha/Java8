package com.te.learn.lamdaComperator;

public class Employee1 {
	private int eAge;
	private int eId;
	private long eSalary;
	private String eName;
	public Employee1() {
		super();
	}
	public Employee1(int eAge, int eId, long eSalary, String eName) {
		super();
		this.eAge = eAge;
		this.eId = eId;
		this.eSalary = eSalary;
		this.eName = eName;
	}
	public int geteAge() {
		return eAge;
	}
	public void seteAge(int eAge) {
		this.eAge = eAge;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public long geteSalary() {
		return eSalary;
	}
	public void seteSalary(long eSalary) {
		this.eSalary = eSalary;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	@Override
	public String toString() {
		return "Employee1 [eAge=" + eAge + ", eId=" + eId + ", eSalary=" + eSalary + ", eName=" + eName + "]";
	}
	
}
