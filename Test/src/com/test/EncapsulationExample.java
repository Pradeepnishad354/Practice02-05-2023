package com.test;

public class EncapsulationExample {

// example of encapsulation 
	private String name;
	private int age;
	
	
	public void setName(String name) {
		
		this.name=name;
	}
	
	public String getName() {
		
		return name;
	}
	
	public void setAge(int age) {
		
		this.age=age;
	}
	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		
		EncapsulationExample e=new EncapsulationExample();
		
		e.setName("pradeep");
		e.setAge(22);
		
		System.out.println(e.getAge()+" "+e.getName());
		
	}
	
}
