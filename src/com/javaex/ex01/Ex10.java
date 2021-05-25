package com.javaex.ex01;

public class Ex10 {

	public static void main(String[] args) {
		//논리 연산자
		int a = 5;
		int b = 7;
		//논리 연산자 기초 &&
		System.out.println("&&연산자 ====================");
		System.out.println(true && true);
		System.out.println(true && false);
		
		System.out.println(true || true);
		System.out.println(true || false);
		
		System.out.println( (a>b)&&!(a>b) );
		System.out.println( !(a>b)&&!(a>b) );
		
	}

}
