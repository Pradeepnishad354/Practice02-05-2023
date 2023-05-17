package com.test;

public class This {
int a=10;
	

public void m1() {
	int a = 8;
	System.out.println(this.a);
}

public static void main(String[] args) {
	
	This t=new This();
	t.m1();
}
}
