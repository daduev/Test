package com.home;


public class Main02 {
	public static void main(String[] args) {
		System.out.println("Main02");
		double d = 566.12;
		long l = Math.round(d);
		int i = (int) (l % 100);
		
		System.out.println(l-i);
	}
}
