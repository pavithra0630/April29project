package org.lang;

public class LanguageInfo extends StateDetails {
	public void tamilLanguage() {
		System.out.println("reading");

	}

	public void hindiLanguage() {
		System.out.println("writing");

	}

	public void englishLanguage() {
		System.out.println("speaking");

	}public static void main(String[] args) {
		LanguageInfo l=new LanguageInfo();
				l.englishLanguage();
		l.hindiLanguage();
		l.tamilLanguage();
		l.northIndia();
		l.southIndia();
	}

}
