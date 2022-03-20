package com.te.learn.java8feature.stream;

public class Student implements Comparable {
	private int studentAge;
	private int studentNo;
	private String StudentName;
	public Student() {
		super();
	}
	public Student(int studentAge, int studentNo, String studentName) {
		super();
		this.studentAge = studentAge;
		this.studentNo = studentNo;
		StudentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public int getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	@Override
	public String toString() {
		return "Student [studentAge=" + studentAge + ", studentNo=" + studentNo + ", StudentName=" + StudentName + "]";
	}
	@Override
	public int compareTo(Object o) {
		Student student=(Student)o;
		if(this.studentAge>student.studentAge)
		{
			return 1;
		}
		else if(this.studentAge<student.studentAge) {
			return -1;
		}
		return 0;
	}
	
}
