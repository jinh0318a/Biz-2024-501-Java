package com.callor.word.exec;

import com.callor.word.service.impl.WordServiceImplV1;

public class WordExecA {
	public static void main(String[] args) {
		String wordFile = "src/com/callor/word/word.txt";
		
		WordServiceImplV1 wsiv1 = new WordServiceImplV1(wordFile);
		wsiv1.wordFileRead();
		wsiv1.wordListPrint();

	}

}
