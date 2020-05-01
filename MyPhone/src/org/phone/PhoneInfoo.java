package org.phone;

public class PhoneInfoo {
	public void phoneInfo(String name, int id) {
		System.out.println("phone model is" + name + "\n+" + "the phone ram is" + id);

	}

	public static void main(String[] args) {
		PhoneInfoo p = new PhoneInfoo();
		p.phoneInfo("iphone", 64);

	}
}
