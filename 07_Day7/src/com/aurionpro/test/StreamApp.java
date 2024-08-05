package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StreamApp {

	public static void main(String[] args) throws IOException {

		FileInputStream fileInputStream = new FileInputStream("D:\\AURIONPRO\\07_Day7\\src\\com\\aurionpro\\test\\Untitled 1");
		
		int ch;
		
//		FileOutputStream fileOuputStream = new FileOuputStream(D:\AURIONPRO\07_Day7\src\com\aurionpro\test\Untitled 2);
		
		while((ch=fileInputStream.read())!= -1) {
			System.out.print((char)ch);
			
//			fileInputStream.read();
		}
		fileInputStream.close();
	}

}
