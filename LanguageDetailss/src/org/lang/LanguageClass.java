package org.lang;

import org.english.English;
import org.tamil.Tamil;

public class LanguageClass extends Tamil{

	public void allLanguage() {
		System.out.println("punjabi,gujarati");
	}
	public static void main(String[] args) {
		LanguageClass lc= new LanguageClass();
		lc.allLanguage();
		lc.tamilLanguage();
		lc.engLanguage();
		lc.teluguLanguage();
				
		
	}
	

}
