package com.callor.word.exec;

import java.io.FileNotFoundException;

import com.callor.word.service.WordService;
import com.callor.word.service.impl.WordServiceImplV2;

public class WordExecB {
	public static void main(String[] args) {

		String wordFile = "src/com/callor/word/word.txt";
		WordService wordService = null;
		try {
			wordService = new WordServiceImplV2(wordFile);
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다");
		}
		
		System.out.println(wordService.getWord());
	}
}
