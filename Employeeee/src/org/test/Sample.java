package org.test;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("empId");
		int empId = sc.nextInt();
		System.out.println("enter empId" + empId);
		System.out.println("empName");
		String empName = sc.next();
		System.out.println("empName is" + empName);
		System.out.println("empEmail");
		String empEmail = sc.next();
		System.out.println("empEmail is" + empEmail);
		System.out.println("empPhoneno");
		long empPhoneno = sc.nextLong();
		System.out.println("empPhoneno is " + empPhoneno);
		System.out.println("empSalary");
		float empSalary = sc.nextFloat();
		System.out.println("empSalary is" + empSalary);

		System.out.println("empCity");
		String empCity = sc.next();
		System.out.println("empCity is" + empCity);
		System.out.println("gender");
		String empGender = sc.next();
		System.out.println("gender is"+empGender);
	

	}
}
