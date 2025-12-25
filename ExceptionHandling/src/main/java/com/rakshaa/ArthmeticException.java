package com.rakshaa;
//ArthmeticException.......
public class ArthmeticException {
	public static void main(String[] args) {
		
		int a =10;
		int b =0;
		System.out.println("Starting Point.......");
		
		try {
		int c = a/b;
		}
		
		catch(Exception e) {
			System.out.println(e);
		}	
		System.out.println("Ending Point.......");	

	}
}
