package com.auribises;

class Student{
	
	int roll;
	String name;
	
}

public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
		
		int i1 = 10;
		int i2 = 20;
		
		int[] arr = new int[100];
		arr[0] = 10;
		arr[1] = 20;
		
		Student s1 = new Student();
		s1.roll = 1;
		s1.name = "John";
		Student s2 = new Student();
		
		Student[] sArr = new Student[100]; // Array of reference variables
		
		sArr[0] = new Student();
		sArr[0].roll = 1;
		sArr[0].name = "John";
		
		
		sArr[1] = new Student();
		
		
		

	}

}
