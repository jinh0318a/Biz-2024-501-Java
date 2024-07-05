package com.callor.word.exec;

import java.io.FileNotFoundException;
import java.util.Scanner;

import com.callor.word.models.WordVO;
import com.callor.word.service.WordService;
import com.callor.word.service.impl.WordServiceImplV2;
import com.callor.word.utils.Line;

/*
 * WordService, WordServiceImplV2 를 사용하여
 * 임의의 단어를 한개 추출하고
 * 한글번역을 보여준 후 영어 단어를 입력받아
 * 단어가 맞았는지 틀렸는지 판별하는 코드 작성
 * 
 */
public class WordExecC {
	public static void main(String[] args) {

		String wordFile = "src/com/callor/word/word.txt";
		WordService wordService = null;
		try {
			wordService = new WordServiceImplV2(wordFile);
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		}

		Scanner scan = new Scanner(System.in);
		WordVO word = wordService.getWord();
		int gameCount = 0;
		while (true) {
			String input = null;
			System.out.println(Line.sLine(100));
			System.out.println("영어 단어 맞추기");
			System.out.println("게임을 중단하려면 QUIT 입력하세요");
			System.out.println(Line.sLine(100));
			System.out.print(word.korean + " >> ");
			
			while (true) {
				input = scan.nextLine();
				if (!input.matches("[A-Za-z]+")) {
					System.out.println("영어만 입력하세요");
					System.out.print(word.korean + " >> ");
					continue;
				}
				break;
			}
			
			if(input.equals("QUIT")) {
				break;
			}
			
			if (word.english.equalsIgnoreCase(input)) {
				System.out.println("정답");
				break;
			} else {
				System.out.println("오답");
				gameCount++;
			}

			if (gameCount > 5) {
				System.out.println("5번의 기회를 모두 소모했습니다");
				break;
			}
		}
	}
}
