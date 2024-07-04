package com.callor.hello;

/*
 * 10 ~ 50 범위의 임의의 정수 1개 생성
 * 생성한 수 만큼의 정수형 배열 선언
 * 배열의 각 요소에 1 ~ 100까지 범위의 Random 수 저장
 * 배열에 저장된 값 출력
 */
public class HelloJ {
	public static void main(String[] args) {

		int num = (int) (Math.random() * 41) + 10;
		int[] array = new int[num];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100) + 1;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "] : " + array[i]);
		}

		System.out.println("\n" + "=".repeat(30));

		// 생성된 요소들 전체를 합산하고, 평균을 계산하여 출력

		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.printf("array 배열 전체 합 : %d \n", sum);
		
		double avg = (double) sum / array.length;
		System.out.printf("array 배열 평균 값 : %.2f", avg);

	}
}
