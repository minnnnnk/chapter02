package com.javaex.ex12;

public class Student extends Person {
	//필드
	private String schoolName;
	//생성자
	public Student() {
		System.out.println("Student()");
	}
	public Student(String schoolName) {
		this.schoolName = schoolName;
		System.out.println("Student(1)");
	}
	public Student(String name, int age, String schoolName) {
		super(name,age);
		this.schoolName = schoolName;
		System.out.println("Student(3)");
	}
	
	
	
	//메소드gs
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	
	//메소드 일반
	@Override
	public void showInfo() {
		//부모꺼 쓰려면 super 그대로는 this
		super.showInfo();
		System.out.println("이름: " +super.name+ " 나이: " +super.age+ " 학교: "+this.schoolName);
	}
		
	public String toString() {
		return "Student [schoolName=" + this.schoolName +  ", getName()=" + super.name+ ", getAge()=" + super.age + "]";
	}
	
}
