package com.test;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
	
	public static void main(String[] args) {
		
		ArrayList<Student> ar=new ArrayList<>();
		
	ar.add( new Student(13,"pradeep","jaunpur"));
		
	ar.add( new Student(12,"rahul","ev"));
	ar.add( new Student(16,"t","jveve"));
	
	Collections.sort(ar);
	
	System.out.println(ar);
	
	
	Collections.sort(ar,new NameComprator());
	System.out.println("sort ::::::"+ar);
	}

}
