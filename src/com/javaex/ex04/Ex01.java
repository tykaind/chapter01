package com.javaex.ex04;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		int i = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력해주세요");
		System.out.print("단 : ");
		int a = sc.nextInt();
		
		while( i<= 9) {
			System.out.println(a+" * "+i+" = "+(i*a));
			i++;
		}
		sc.close();
	}
}
