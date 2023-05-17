package com.test.start;

import java.util.ArrayList;

public class AL {
	
	public static void main(String[] args) {
		
		
		
		ArrayList<Student> l=new ArrayList<>();
		
		
		l.add(new Student(1,"pradeep","jaunpur"));
		l.add(new Student(2,"amit","varansi"));
		
		l.sort(new NameComparator());
		
		System.out.println(l.toString());
	}

}
