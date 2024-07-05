package com.callor.word.exec;
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

import java.util.Scanner;

public class ScannerC {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String name = null;
		int intKor = 0;
		int intEng = 0;
		int intMath = 0;
		int intSum = 0;
		float floatAvg = 0;

		System.out.println("학생의 이름을 입력하세요");
		System.out.print(" >> ");
		name = scan.nextLine();

		System.out.println("과목성적을 입력하세요 ");
		while (true) {
			System.out.print("국어 >> ");
			String strKor = scan.nextLine();
			try {
				intKor = Integer.valueOf(strKor);
				if (intKor < 0 || intKor > 100) {
					System.out.println("점수는 0 부터 100점까지만 입력하세요");
					continue;
				}
			} catch (Exception e) {
				System.out.println("국어 점수는 숫자로만 입력하세요");
				continue;
			}
			break;
		}
		while (true) {
			System.out.print("영어 >> ");
			String strEng = scan.nextLine();
			try {
				intEng = Integer.valueOf(intEng);
				if (intEng < 0 || intEng > 100) {
					System.out.println("점수는 0 부터 100점까지만 입력하세요");
					continue;
				}
			} catch (Exception e) {
				System.out.println("영어 점수는 숫자로만 입력하세요");
				continue;
			}
			break;
		}
		while (true) {
			System.out.print("수학 >> ");
			String strMath = scan.nextLine();
			try {
				intMath = Integer.valueOf(intMath);
				if (intMath < 0 || intMath > 100) {
					System.out.println("점수는 0 부터 100점까지만 입력하세요");
					continue;
				}
			} catch (Exception e) {
				System.out.println("수학 점수는 숫자로만 입력하세요");
				continue;
			}
			break;
		}

		intSum = intKor + intEng + intMath;
		floatAvg = (float) intSum / 3;

		System.out.println("=".repeat(30));
		System.out.println("학생이름 : " + name);
		System.out.println("국어 : " + intKor);
		System.out.println("영어 : " + intEng);
		System.out.println("수학 : " + intMath);
		System.out.println("-".repeat(30));
		System.out.println("총점 : " + intSum);
		System.out.printf("평균 : %.2f \n", floatAvg);
		System.out.println("=".repeat(30));

	}
}
