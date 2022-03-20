package com.te.learn.collectionFramework.set;

public class Student3 implements Comparable{
	private int sId;
	private String sName;
	private int age;
	public Student3() {
		super();
	}
	public Student3(int sId, String sName, int age) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.age = age;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}	
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student3 student3=(Student3) o;
		if(this.age>student3.age) {
			return 1;
		}
		if(this.age<student3.age) {
			return -1;
		}
		
		return 0;
	}
	
}
