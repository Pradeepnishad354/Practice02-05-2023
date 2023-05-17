package com.test;

interface A {
	public abstract void m1();

}

public class InterfaceExa implements A{

	

	@Override
	public void m1() {
		System.out.println("this is implemwntaion class");
		
	}
	
	
	public static void main(String[] args) {
		InterfaceExa i=new InterfaceExa();
		i.m1();
		
		
		
	}
}

