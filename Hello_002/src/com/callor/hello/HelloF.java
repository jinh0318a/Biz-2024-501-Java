package com.callor.hello;

public class HelloF {

	/*
	 * 아래코드에 별도의 변수를 선언하지 않고 prime 수인지 검사하는 코드를 완성
	 * 
	 */
	public static void main(String[] args) {

		int num = 5;
		int i;
		for (i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				break;
			}
		}

		int index;
		for (index = 2; index < num; index++) {
			if (num % index == 0) {
				break;
			}
		}

		if (index < num) {
			System.out.println(num + "는 소수 아님");
		} else {
			System.out.println(num + "는 소수");
		}

	}
}
