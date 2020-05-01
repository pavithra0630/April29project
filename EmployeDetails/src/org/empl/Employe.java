package org.empl;

public class Employe {

	public static char F;
	public void empId(int id, char gender) {
		System.out.println("emp phone is" + id);
		System.out.println("emp gender is" + gender);

	}
	public static void main(String[] args) {
		Employe e= new Employe();
		e.empId(100451, 'F');
		
		
		
		
	}

}
