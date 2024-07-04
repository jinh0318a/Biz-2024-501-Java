package com.callor.hello;

/*
 * main method 를 만들고
 * 정수 1 ~ 10까지 숫자를 Console 에 출력
 * 
 */
public class HelloG {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
		System.out.println("=".repeat(30));

		for (int i = 0; i < 10; i++) {
			System.out.print(i + 1);
			if (i + 1 < 10) {
				System.out.print(", ");
			}
		}
		System.out.println("\n" + "=".repeat(30));

		for (int i = 0; i < 100; i++) {
			System.out.print(i + 1);
			System.out.print(" ");
			if (((i + 1) % 5) == 0) {
				System.out.print("\n");
			}

		}

	}

}
