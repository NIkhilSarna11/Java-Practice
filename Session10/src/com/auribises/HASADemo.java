package com.auribises;

class Employee{
	
	int id;
	String name;
	int salary;
	
	Address adrs; // HAS-A   | one to one
	Project[] pArr; // Has-A | one to many
	
}

class Project{
	int id;
	String technology;
	int teamSize;
}

class Address{
	int id;
	String adrsLine;
	String city;
	String state;
	int zipCode;
}

public class HASADemo {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.id = 101;
		e.name = "John Watson";
		e.salary = 45000;
		
		e.adrs = new Address();
		e.adrs.adrsLine = "Auribises Technologies";
		e.adrs.city = "Ludhiana";
		
		Address a = new Address();
		
		e.adrs = a; // Reference Copy
		
		e.pArr = new Project[10];
	}

}
