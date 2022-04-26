package com.javaex.ex12;

public class PersonApp {

	public static void main(String[] args) {
		
		/*Person p01 = new Person("김민규" , 25);
		p01.showInfo();
		
		Student s01 = new Student("서울고등학교");
		System.out.println(s01.toString());
		*/
		
		
		/*Student s02 = new Student(); //순서 부모만들고 자식
		s02.setAge(24);
		s02.setName("김");
		s02.setSchoolName("서초");
		*/
		
		Student s03 = new Student("김민규" , 25, "서울대학교");
		System.out.println(s03.getName());
		System.out.println(s03.toString());
		s03.showInfo();
	}

}
