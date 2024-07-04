package com.callor.hello;

/*
 * prime(int num) method 를 생성하고
 * 매개변수로 전달받은 num 의 값이 소수 인지 판별하여
 * 결과를 return하기
 * 
 * 
 */

public class HelloE {

	public static boolean prime(int num) {
		if (num <= 1) {
			return false;
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int num = 151;

		if (prime(num)) {
			System.out.println(num+"은 소수이다.");
		}else {
			System.out.println(num+"은 소수가 아니다.");
		}

	}

}
