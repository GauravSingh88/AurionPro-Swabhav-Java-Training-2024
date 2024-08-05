package com.aurionpro.day07;

import java.io.FileInputStream;
import java.io.IOException;


public class LineWordCharacterCounter {

	public static void main(String[] args) throws IOException {
			
		FileInputStream fileInputStream = new FileInputStream("D:\\AURIONPRO\\Homework\\src\\com\\aurionpro\\day7\\Text1");
		
		int ch;
		int wordCount = 0;
		int lineCount = 0;
		int characterCount = 0;
		
		while((ch=fileInputStream.read())!= -1) {
			
			characterCount++;
			
			if(((char)ch == ' ' || (char)ch == '\n' || (char)ch == '\t' ) && (char)ch != ' '+' ') {
				wordCount++;
				if(ch == '\n') {
					lineCount++;
				}
				
//				System.out.println("words : " + wordCount + " characters : " + characterCount + " lines : " + lineCount);
			} else {
//				System.out.println("words : " + wordCount + " characters : " + characterCount + " lines : " + lineCount);

			}
			

		}
		
		if(characterCount != 0) {
			lineCount++;
			wordCount++;
		}
		
		System.out.println("words : " + wordCount + " characters : " + characterCount + " lines : " + lineCount);

	}

}
