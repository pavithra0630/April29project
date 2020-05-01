package org.phone;

public class PhoneInfo {
	public void phoneModel(String name) {
		System.out.println("phone Model is " + name);

	}

	public void phoneRam(int Ram) {
		System.out.println("phone ram is" + Ram);

	}
	public static void main(String[] args) {
		PhoneInfo p= new PhoneInfo();
		p.phoneModel("samsung");
		p.phoneRam(64);
		
		
	}

	{

	}
}
