package com.javaex.ex05;

public class Ex07 {

	public static void main(String[] args) {

		int[] i = {10, 20, 30};
		int[] j = {10, 20, 30};
		
		if(i.length == j.length) {
		for(int p=0; p<i.length; p++) {
			if(i[p] == j[p]) {
				System.out.println(p+"번째방의 수는 일치합니다.");
			}else {
				System.out.println(p+"번째방의 수는 일치하지 않습니다.");
			}
		}
		
		}else {
			System.out.println("배열의 개수가 다릅니다.");
		}

	}

}
