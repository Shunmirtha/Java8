package com.te.learn.collectionFramework.set;

import java.util.Objects;

public class Student2 {
	
	private int sId;
	private String sName;
	private int age;
	public Student2() {
		super();
	}
	public Student2(int sId, String sName, int age) {
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
	public int hashCode() {
		return Objects.hash(age, sId, sName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student2 other = (Student2) obj;
		return age == other.age && sId == other.sId && Objects.equals(sName, other.sName);
	}
	
}
