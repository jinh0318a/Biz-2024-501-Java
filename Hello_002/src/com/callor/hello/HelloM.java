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
public class HelloM {

	public static int prime(int num) {

		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return 0;
		}
		return num;
	}

	public static void main(String[] args) {
		int[] nums = new int[50];

		// 생성된 배열에 랜덤수 할당
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 99) + 2;
		}

		int sum = 0;
		int count = 0;
		for (int num : nums) {
			int result = prime(num);
			sum += result;
			if (result > 0)
				count++;
		}
		System.out.println("=".repeat(30));
		System.out.println("소수 개수 : " + count);
		System.out.println("소수 합 : " + sum);
		System.out.printf("평균 : %.2f \n", (double) sum / count);
		System.out.println("=".repeat(30));
	}
}
