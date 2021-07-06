package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {
		
		
		int[] no = new int[6];
		
		System.out.println(no.length);
		System.out.println("==========");
		
		for(int i=0; i<no.length; i++) {
			no[i] = (int)(Math.random()*45)+1;
		}
		
		
		//.length 방개수 알수있음
		
			for(int i=0; i<no.length; i++) {
				System.out.println(no[i]);
			
		}

	}

}
