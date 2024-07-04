package com.callor.hello;
/*
 * 정수형 배열 50개를 선언하고
 * 정수 2 ~ 100 범위의 Random 수를 각각 생성하여
 * 배열 요소에 저장
 * 
 * 배열에 저장된 정수가 prime 수인 경우 합산하여 출력
 * 배열에 저장된 정수들 중에 prime 수가 몇개인가 출력
 * 
 */

public class HelloL {
	public static void main(String[] args) {

		int[] array = new int[50];

		int cnt = 0;
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = 2 + (int) (Math.random() * 99);
		}

		for (int num : array) {
			boolean isPrime = true;
			for (int a = 2; a < num; a++) {
				if (num % a == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				cnt++;
				sum += num;
			}
		}

		System.out.println(cnt);
		System.out.println(sum);

	}
}
