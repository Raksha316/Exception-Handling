package com.rakshaa;
//IndexOutOfBoundsException...........
public class B {
	public static void main(String[] args) {
		
		int[] a = new int[5];
		
		try {
			System.out.println(a[6]);
		}
		
		catch(IndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

}
