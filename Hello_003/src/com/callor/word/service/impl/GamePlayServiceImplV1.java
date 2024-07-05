package com.callor.word.service.impl;

import java.util.Scanner;

import com.callor.word.models.WordVO;
import com.callor.word.service.GamePlayService;
import com.callor.word.service.WordService;
import com.callor.word.utils.Line;

public class GamePlayServiceImplV1 implements GamePlayService {

	protected final WordService wordService;
	protected final Scanner keyInput;
	protected WordVO word = null;

	public GamePlayServiceImplV1(WordService wordService) {
		super();
		this.wordService = wordService;
		this.keyInput = new Scanner(System.in);
	}

	@Override
	public void gameStart() {
		while(true) {
			System.out.println(Line.dLine(100));
			System.out.println("World Word Game Festival !!");
			System.out.println(Line.dLine(100));
			System.out.println();
			word = wordService.getWord();
			System.out.println("다음에 제시된 번역과 일치하는 영어 단어를 입력하세요");
			
			
			
		}
	}

	@Override
	public void getWord() {

	}

	@Override
	public void inputWord() {

	}

	@Override
	public void score() {

	}

}
