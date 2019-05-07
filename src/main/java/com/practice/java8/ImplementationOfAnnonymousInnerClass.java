package com.practice.java8;

import java.util.ArrayList;

public class ImplementationOfAnnonymousInnerClass {

	static ArrayList<String> al;
	public static void main(String a[]) 
	{
		al= new ArrayList<String>();
		al.add("AbC");
		al.add("cde");
		al.add("cde1");
		al.add("cde2");
		al.add("cde3");

		
		PrintConditionally(al,new Condition() {
			@Override
			public boolean test(String l) {
				if(!l.startsWith("c"))
					return false; 
				return true;
			}
		});
	}
	
	
	public static void PrintConditionally(ArrayList<String> al1, Condition condition) {
		
		for(String k:al1) 
		{
			if(condition.test(k)) 
			{
				System.out.println(":::"+k);
			}
		}
	};
	
	interface Condition{
		boolean test(String l);
	}
}
