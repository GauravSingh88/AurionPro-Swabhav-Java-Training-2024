package com.aurionpro.day11.test;

//Outer class
public class OuterClass {
 
 // Member variable of the outer class
 private int outerData = 10;
 
 // Constructor for the outer class
 public OuterClass() {
     System.out.println("OuterClass instance created.");
 }
 
 // Nested static class (can access only static members of OuterClass)
 public static class NestedStaticClass {
     
     // Static member variable of the nested static class
     private static int nestedStaticData = 20;
     
     // Static method of the nested static class
     public static void displayNestedStaticData() {
         System.out.println("NestedStaticClass: nestedStaticData = " + nestedStaticData);
     }
 }
 
 // Inner class (non-static nested class)
 public class InnerClass {
     
     // Member variable of the inner class
     private int innerData = 30;
     
     // Constructor for the inner class
     public InnerClass() {
         System.out.println("InnerClass instance created.");
     }
     
     // Method of the inner class accessing outer class member
     public void displayOuterData() {
         System.out.println("InnerClass: outerData = " + outerData);
     }
     
     // Method of the inner class accessing nested static class member
     public void displayNestedStaticData() {
         System.out.println("InnerClass: nestedStaticData = " + NestedStaticClass.nestedStaticData);
     }
 }
 
 // Method of the outer class
 public void testNestedAndInnerClasses() {
     System.out.println("Accessing nested static class:");
     NestedStaticClass.displayNestedStaticData();
     
     System.out.println("\nCreating inner class instance:");
     InnerClass innerObj = new InnerClass();
     innerObj.displayOuterData();
     innerObj.displayNestedStaticData();
 }
 
 // Main method to run the POC
 public static void main(String[] args) {
     OuterClass outerObj = new OuterClass();
     outerObj.testNestedAndInnerClasses();
 }
}

