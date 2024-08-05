package com.aurionpro.day07;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Path;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Scanner;


public class JavaFilePOC {

	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\AURIONPRO\\Homework\\src\\com\\aurionpro\\day7\\Text2");
		
		if(file.createNewFile()) {
			System.out.println("File created : " + file.getName());
		} else {
			System.out.println("Error in file creation");
		}
		
//		if(file.delete()) {
//			System.out.println("File deleted : " + file.getName());
//		} else {
//			System.out.println("Error in file creation");
//		}
		
		String pathify = file.pathSeparator;
		System.out.println(pathify);
		
		
		String namee = file.getName();
		System.out.println(namee);
		
		String parentss = file.getParent();
		System.out.println(parentss);
		
		boolean readd = file.canRead();
		System.out.println(readd);
		
		boolean writee = file.canWrite();
		System.out.println(writee);

		boolean executee = file.canExecute();
		System.out.println(executee);
		
		boolean absolutee = file.isAbsolute();
		System.out.println(absolutee);
		
		boolean directoryy = file.isDirectory();
		System.out.println(directoryy);
		
		boolean filee = file.isFile();
		System.out.println(filee);
		
		long spacee = file.getFreeSpace();
		System.out.println(spacee);
		
		Path getPath = file.toPath();
		System.out.println(getPath);
		
		URI getUri = file.toURI();
		System.out.println(getUri);
		
		
		
		
		
		
		FileWriter fileWriter = new FileWriter("D:\\AURIONPRO\\Homework\\src\\com\\aurionpro\\day7\\Text2");
		fileWriter.write("This is made using file writer");
		fileWriter.close();
		System.out.println("Successfully writen");
		
		
		
		
		FileInputStream fileInputStream = new FileInputStream("D:\\AURIONPRO\\Homework\\src\\com\\aurionpro\\day7\\Text1");
		
		int ch;
		
		while((ch=fileInputStream.read()) != -1) {
			System.out.print((char)ch);
		}
		System.out.println();
		
		
		
		
		Scanner sc = new Scanner(file);
	      while (sc.hasNextLine()) {
	        String data = sc.nextLine();
	        System.out.println(data);
	      }
	      
	     
	      
	    System.out.println();
//	    FileOutputStream fileOutputStream = new FileOutputStream("D:\\AURIONPRO\\Homework\\src\\com\\aurionpro\\day7\\Text2");
//		
//		
//		while((ch=fileInputStream.read()) != -1) {
//			fileOutputStream.write(ch);
//			System.out.println("file copied successfully");
//		}
//		System.out.println();
	      
	      
	      
	      
	     
		
		
		

	}

}
