package com.callor.word.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.word.models.WordVO;
import com.callor.word.service.WordService;
import com.callor.word.utils.Line;

public class WordServiceImplV1 implements WordService {

	/*
	 * 클래스 생성자 매개변수를 통하여 wordFile 값을 전달받기 클래스 생성자에서 wordList 를 초기화 하기
	 * 
	 * 생성자를 통해서 내용이 채워지는 벼수나 초기화 되는 객체는 final 키워드를 부착하여 다른 method 에서 변수나 객체를 변형할 수
	 * 없도록 한다
	 * 
	 * protected : 이 클래스를 장래에 상속을 하여 다른 클래스를 만들었을때 wordFile 변수와, wordList 객체를 공유할 수
	 * 있도록 하는 조치
	 */
	protected final String wordFile;
	protected final List<WordVO> wordList;
	protected final Scanner fileScan;

	/*
	 * throws Exception 만약 현재 method 에서 exception 이 발생하면 직접처리하지 않고 나를
	 * 호출한곳(WordService 객체를 생성하는 곳)으로 exception 을 보냄
	 */
	public WordServiceImplV1(String wordFile) throws FileNotFoundException {
		this.wordFile = wordFile;
		this.wordList = new ArrayList<WordVO>();

		InputStream fileInput = null;
		fileInput = new FileInputStream(this.wordFile);
		fileScan = new Scanner(fileInput);
		
		this.wordFileRead();
	}

	/*
	 * word.txt 파일을 읽어서 각 단어를 : 으로 분해하기 분해된 단어를 영문과 번역으로 구분하여 WordVO 에 담기 WordVO 를
	 * wordList 에 추가하기
	 */
	@Override
	public void wordFileRead() {
		while (this.fileScan.hasNext()) {
			String line = this.fileScan.nextLine();
			String[] lines = line.split(":");
			WordVO wordVO = new WordVO(lines[0], lines[1]);
			this.wordList.add(wordVO);
		}
	}

	/*
	 * 단어장 리스트 ================= 영문단어 한글번역 ----------------- ... ... ...
	 * =================
	 * 
	 */
	@Override
	public void wordListPrint() {
//		if (this.wordList.size() < 1)
//			this.wordFileRead();
		System.out.println("단어장 리스트");
		System.out.println("영어단어\t\t\t한글번역");
		System.out.println(Line.dLine(50));
		for (int i = 0; i < this.wordList.size(); i++) {
			System.out.print(this.wordList.get(i).english + "\t\t\t" + this.wordList.get(i).korean + "\n");
			if (i != this.wordList.size() - 1) {
				System.out.println(Line.sLine(50));
			}
		}
		System.out.println(Line.dLine(50));
	}

	@Override
	public WordVO getWord() {
		return null;
	}

}
