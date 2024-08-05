package com.aurionpro.day07;

import java.util.Scanner;

public class CharacterShifter {
	
	public static String shiftCharacters(String input, int n) {
        char[] chars = input.toCharArray();
        int length = chars.length;

        for (int i = 0; i < length; i++) {
            char c = chars[i];

            if (Character.isLowerCase(c)) {
                chars[i] = (char) ('a' + (c - 'a' + n) % 26);
            } else if (Character.isUpperCase(c)) {
                chars[i] = (char) ('A' + (c - 'A' + n) % 26);
            } else {
                chars[i] = c;
            }
        }

        return new String(chars);
    }
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter input string:");
        String input = sc.nextLine();

        String shiftedString = shiftCharacters(input, n);
        
        System.out.println("Shifted string: " + shiftedString);

        sc.close();
    }

}
