package com.callor.hello;

/*
 * 정수형 배열 100개를 선언하고
 * 0번 배열부터 순서대로 1 ~ 100까지 정수를 저장하기
 * 
 */

public class HelloH {

	public static void main(String[] args) {

		int[][] array = new int[100][1];
		for (int i = 0; i < array.length; i++) {
			array[i][0] = i+1;
		}
		
	}
}
