package com.javaex.ex04;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		/* 첫번째로 작성한 코드*/
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요. [0이면 종료]");
		int i = 0;
		
		
		while(true) {
		int num = sc.nextInt();
			if(num > 0) {
				i += num;
				System.out.println("합계: "+i);
				continue;
			}else
				System.out.println("종료");
			break;
		}
		sc.close();
		
		
		
		//두번째 do~while문 사용
		/*=====================================================
		 Scanner sc = new Scanner(System.in); int num; int sum=0;
		 
		 System.out.println("숫자를 입력하세요. [0이면 종료]");
		  
		 do { num = sc.nextInt(); sum +=num; System.out.println("합계: "+sum); }while(
		 num !=0 ); System.out.println("종료");
		 ======================================================*/
		
		
		
		
	}

}
