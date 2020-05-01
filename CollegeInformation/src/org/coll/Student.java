package org.coll;

public class Student extends College {

	public void studentName() {
		System.out.println("pavithra");
	}

	public void studentId() {
		System.out.println("1004851");
	}

	public void studentRank() {
		System.out.println("10");
	}
	public static void main(String[] args) {
		Student s= new Student();
		s.collegeDept();
		s.collegeName();
		s.collegeRank();
		s.studentId();
		s.studentName();
		s.studentRank();
		s.deptName();
		
		
	}

}
