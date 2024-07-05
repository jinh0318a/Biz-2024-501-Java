package com.callor.word.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

/*
 * word.txt 파일을 읽어서 파일의 내용을 화면에 출력하기
 * 
 */
public class FileA {
	public static void main(String[] args) {
		String wordFile = "src/com/callor/word/word.txt";
		// 파일, 네트워크 등을 통해서 데이터를 읽어 컴퓨터로 가져오는 도구
		InputStream in = null;

		// word.txt 파일을 Streaming 방식으로 열어서 뭔가 처리할 준비
		try {
			in = new FileInputStream(wordFile);
		} catch (FileNotFoundException e) {
			System.out.println(wordFile + "파일을 읽을 수 없습니다");
		}

		// Streaming 처리된 파일 정보와 Scanner를 연동하여
		// 파일을 읽은 준비하기
		Scanner scan = new Scanner(in);

		while (scan.hasNext()) {
			// Streaming 처리된 파일을 한줄 읽어오기
			String line = scan.nextLine();
			System.out.println(line);
		}

	}
}
