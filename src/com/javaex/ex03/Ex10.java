package com.javaex.ex03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		System.out.print("숫자: ");
		int a = sc.nextInt();
		
		switch(a) {
		//값이 "1"일때 실행되고 break로 조건문을 빠져나간다.
		case 1:
			System.out.println("R101호");
		break;
		
		//값이 "2"일때 실행되고 break로 조건문을 빠져나간다.
		case 2:
			System.out.println("R202호");
		break;
		
		//값이 "3"일때 실행되고 break로 조건문을 빠져나간다.
		case 3:
			System.out.println("R303호");
		break;
		
		//값이 "3"일때 실행되고 break로 조건문을 빠져나간다.
		case 4:
			System.out.println("R404호");
		break;
		
		//정해져있는 값이 없을때 이조건문을 빠져나간다.
		default:
			System.out.println("상담원에게 문의하세요.");
		break;
		
		}
		sc.close();
	}

}
