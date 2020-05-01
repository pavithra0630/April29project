package org.comp;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("64 ");
	}
	public static void main(String[] args) {
		Desktop d= new Desktop();
		d.computerModel();
		d.desktopSize();
	}

}
