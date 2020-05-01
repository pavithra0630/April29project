package org.univ;

public class College extends University {

	@Override
	public void ug() {
		System.out.println("undergraduate");
	}

	@Override
	public void pg() {
		System.out.println("post graduate");
	}

	@Override
	public void doctorate() {
		System.out.println("doctor ");
	}

	public static void main(String[] args) {
    College c1= new College();
    c1.doctorate();
    c1.ug();
    c1.pg();
    
		

	}


}
