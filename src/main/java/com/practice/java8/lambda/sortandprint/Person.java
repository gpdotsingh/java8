package com.practice.java8.lambda.sortandprint;

public class Person {
String firstName;
String lastName;
int salary;
public Person(String firstName, String lastName, int salary) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.salary = salary;
}
@Override
public String toString() {
	return "Person [firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + "]";
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
}
