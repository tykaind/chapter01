package com.javaex.ex03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요!");
		int a = sc.nextInt();
		
		switch(a) {

		case 1:
			System.out.println("31일");
		break;

		case 2:
			System.out.println("28일");
		break;

		case 3:
			System.out.println("31일");
		break;

		case 4:
			System.out.println("30일");
		break;
		
		case 5:
			System.out.println("31일");
		break;
		
		case 6:
			System.out.println("30일");
		break;
		
		case 7:
			System.out.println("31일");
		break;
		
		case 8:
			System.out.println("31일");
		break;
		
		case 9:
			System.out.println("30일");
		break;
		
		case 10:
			System.out.println("31일");
		break;
		
		case 11:
			System.out.println("30일");
		break;
		
		case 12:
			System.out.println("31일");
		break;
		
		//정해져있는 값이 없을때 이조건문을 빠져나간다.
		default:
			System.out.println("1월~12월까지 입력해주세요.");
		break;
		
		}
		sc.close();
	}

}
