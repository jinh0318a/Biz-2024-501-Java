package com.callor.hello;

/*
 * 1~100까지 정수중
 * 짝수들의 전체 합 계산
 *
 */
public class HelloD {
	public static void main(String[] args) {

		int sum = 0;
		for (int i = 0; i < 100; i++) {
			int num = i + 1;
			if (num % 2 == 0) {
				sum += num;
			}
		}
		System.out.printf("1 ~ 100까지 정수중 짝수의 합 : %d", sum);

	}
}
