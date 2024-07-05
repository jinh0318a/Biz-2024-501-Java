package com.callor.word.exec;

import java.util.Scanner;

/*
 * 키보드를 통하여 학생이름, 국어, 영어, 수학 성적을 차례로 입력받고
 * 
 * =========
 * 학생이름 : 
 * 국어 :
 * 영어 : 
 * 수학 :
 * ------------------
 * 총점 :
 * 평균 :
 * ==============
 */
public class ScannerB {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String name = null;
		String korean = null;
		String english = null;
		String math = null;

		while (true) {
			System.out.print("이름을 입력해주세요 : ");
			name = scan.nextLine();
			System.out.print("국어점수를 입력해주세요 : ");
			korean = scan.nextLine();
			System.out.print("영어점수를 입력해주세요 : ");
			english = scan.nextLine();
			System.out.print("수학점수를 입력해주세요 : ");
			math = scan.nextLine();
			if (korean.matches("[0-9]+") && english.matches("[0-9]+") && math.matches("[0-9]+")) {
				break;
			}
		}

		int sum = Integer.parseInt(korean) + Integer.parseInt(english) + Integer.parseInt(math);
		double avg = (double) sum / 3;

		System.out.println("=".repeat(30));
		System.out.println("학생이름 : " + name);
		System.out.println("국어 : " + korean);
		System.out.println("영어 : " + english);
		System.out.println("수학 : " + math);
		System.out.println("-".repeat(30));
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.2f \n", avg);
		System.out.println("=".repeat(30));

	}

}
