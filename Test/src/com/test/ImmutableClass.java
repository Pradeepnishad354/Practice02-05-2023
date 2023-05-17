package com.test;

public final class ImmutableClass {

	// immutable class demo 
final String panNumber ;
	
	public ImmutableClass(String panNumber){
		
		this.panNumber=panNumber;
	}
	
	public String getPanNumber() {
		
		return panNumber;
	}
	
	public static void main(String[] args) {
		
		ImmutableClass i=new ImmutableClass("ABC123");
		
		String panNumber2 = i.getPanNumber();
		System.out.println(panNumber2);
	}
}
