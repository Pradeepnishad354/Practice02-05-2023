package com.test;

import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) {
		
		int[] myArray={12,15,9,10,6,3};
		
		int min,max,x,lcm=0;
		
		for(int i=0; i<myArray.length; i++) {
			
			for(int j=i+1; j<myArray.length-1; j++) {
				
				if(myArray[i]>myArray[j]) {
					min=myArray[j];
					max=myArray[i];
				}else {
					min=myArray[i];
					max=myArray[j];
					
				}
				for(int k=0; k<myArray.length; k++) {
					x=k*max;
					if(x%min==0) {
						
						lcm=x;
					}
				}
			}
			
		}
		System.out.println(Arrays.toString(myArray));
		System.out.println("lcm of given array is "+lcm);
	}
	
}
