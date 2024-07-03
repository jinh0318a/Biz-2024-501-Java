package com.callor.hello;

/*
 * main method 를 선언하고
 * 정수 30과 40을 변수에 저장하고
 * 1. 정수 30과 40을 덧셈
 * 2. 정수 30과 덧셈한 결과를 뺄셈
 * 3. 정수 40과 뺄셈한 결과를 곱셈
 * 4. 덧셈한 결과와 뺄셈한 결과를 나눗셈 
 * 
 */
public class HelloF {
	public static void main(String[] args) {

		int num1 = 30;
		int num2 = 40;

		int plus = num1 + num2;
		int minus = num1 - plus;
		int multiply = num2 * minus;
		double div = (double) plus / minus;
	
		System.out.printf("%d + %d = %d\n", num1, num2, plus);
		System.out.printf("%d - %d = %d\n", num1, plus, minus);
		System.out.printf("%d * %d = %d\n", num2, minus, multiply);
		System.out.printf("%d ÷ %d = %.2f\n", plus, minus, div);

	}
}
