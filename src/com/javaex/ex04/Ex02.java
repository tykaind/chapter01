package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		int h = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i<=10; i++ ) {
			h += i;
			System.out.println(i+" 까지의 합은 "+ h);
		}
		
		
		sc.close();

	}

}
