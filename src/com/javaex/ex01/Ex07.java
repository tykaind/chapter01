package com.javaex.ex01;

public class Ex07 {

	public static void main(String[] args) {
		
		//정수로 바꿔서 계산하기떄문에 2 라는 결과값이 나왔다.
		int v5 = (int)1.3 + (int) 1.8 ;
		System.out.println(v5);
		
		//실수에서 계산이 먼저 이루어지고 정수로 바꿧기 떄문에 3 이라는 값이나왔다.
		int v6 = (int)(1.3 + 1.8);
		System.out.println(v6);
	}
}
