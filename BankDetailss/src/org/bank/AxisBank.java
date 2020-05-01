package org.bank;

public class AxisBank extends BankInfo {

	@Override
	public void savings() {
		System.out.println("7%");
	}

	@Override
	public void fixed() {
		System.out.println("8%");
	}

	@Override
	public void deposit() {
		System.out.println("9%");
	}
	public static void main(String[] args) {
	AxisBank a1= new AxisBank();
	a1.deposit();
	a1.fixed();
	a1.savings();
	}

}
