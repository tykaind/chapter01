package com.javaex.ex04;

public class Ex05 {

	public static void main(String[] args) {
		int sum = 0;
		for( int i=1; i<=9; i++) {
			for(int ii=1; ii<=9; ii++) {
				sum = (i*ii);
				System.out.println(i+" * "+ii+" = "+sum);
				
			}
		}
	}
}
