package com.callor.hello;

/*
 * 2 ~ 100 까지 범위의 Random 수 1개를 만들고
 * 그 수가 prime 인지 아닌지 판단
 */
public class HelloK {

	public static void main(String[] args) {

		int num = (int) (Math.random() * 99) + 2;

		boolean isPrime = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.printf("%d은/는 소수", num);
		} else {
			System.out.printf("%d은/는 소수가 아님", num);
		}

	}

}
