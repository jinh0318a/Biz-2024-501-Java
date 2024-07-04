package com.callor.hello;

/*
 *  1~100까지 정수중에
 *  2의 배수이고, 3의 배수인 숫자
 * 
 */
public class HelloC {
	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			int num = i + 1;
			if ((num % 2 == 0) && (num % 3 == 0)) {
				System.out.println(num);
			}
		}

	}
}
