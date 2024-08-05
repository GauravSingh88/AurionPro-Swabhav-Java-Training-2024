package com.home.selfWork;


import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Scanner;

public class StreamCheck {

	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream = new FileInputStream("D:\\AURIONPRO\\Homework\\src\\com\\aurionpro\\day7\\Text1");
		
		int ch;
		
		FileOutputStream fileOutputStream = new FileOutputStream("D:\\AURIONPRO\\Homework\\src\\com\\aurionpro\\day7\\Text3");
		
		
		while((ch=fileInputStream.read()) != -1) {
			fileOutputStream.write(ch);
			System.out.println("file copied successfully");
		}
		System.out.println();
		
		while((ch=fileInputStream.read()) != -1) {
			System.out.print((char)ch);
		}
		System.out.println();
		

	}

}
