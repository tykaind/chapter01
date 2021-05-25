package com.javaex.ex02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이 : ");
		int ag = sc.nextInt();
		
		sc.nextLine(); // 이걸넣어준건 위에서 숫자입력후 엔터를 누르면 엔터가남아서 오류가난다
					   // 	이걸 넣어줌으로써 엔터를 무마시킨다.
		
		System.out.println("이름을 입력해주세요");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.println("당신의 이름은 " +name+ " 나이는 " + ag + " 입니다.");
		
		sc.close();
				

	}

}
