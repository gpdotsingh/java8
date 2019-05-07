package com.practice.java8.lambda.sortandprint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class SortANdPrintUsingLambda {

	
	public static void main(String a[]) {
		
		List<Person> person=returnPersonList();
		
		
		// Sort the list on basis of last name
		
Collections.sort(person,(p1,p2)->p1.getLastName().compareTo(p2.getLastName()));	
System.out.println(person);

printConditionally(person,p->p.getLastName().startsWith("S"),p->System.out.println(p));
printConditionally(person,p->true,p->System.out.println(p));

	}
	
	private static void printConditionally(List<Person> person, Predicate<Person> c,Consumer<Person> consumner) {
		System.out.println("");
		for(Person p:person) {
			if(c.test(p))
				consumner.accept(p);
		}
	}

	public static List<Person> returnPersonList() {
		
		List<Person> person=new ArrayList<Person>();
		person.add(new Person("Gaurav","Singh",400000));
		person.add(new Person("Saurav","Singh",400000));
		person.add(new Person("Devesh","Suntha",400000));
		person.add(new Person("Ramit","Gupta",400000));
		person.add(new Person("Kunal","Baliyan",400000));
		person.add(new Person("Pammu","Tripathi",400000));
		return person;
	}
}

