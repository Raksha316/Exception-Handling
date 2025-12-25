package com.rakshaa;
//NullPointerException..........
public class A {
	
	void m1() {
		System.out.println();
	}
	public static void main(String[] args) {
		
		try {
		A e = null;
		e.m1();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
