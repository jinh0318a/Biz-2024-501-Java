package com.callor.score.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.models.ScoreDto;
import com.callor.score.service.ScoreService;
import com.callor.score.utils.Contract;
import com.callor.score.utils.Line;

/*
 * 생성자를 통해서 score.txt 파일의 경로 주입받기
 * Scanner 를 사용하여 파일을 읽을 수 있도록 준비
 * 클래스 영역에 List<ScoreDto> scoreList 객체 선언하기
 * 생성자에서 scoreList 객체 초기화 하기
 * loadScoreData() 에서 파일을 읽어 scoreList 객체에 추가하기
 */
public class ScoreServiceImplV1 implements ScoreService {

	protected final String scoreDataFile;
	protected final Scanner fileReader;
	protected final List<ScoreDto> scoreList;

	public ScoreServiceImplV1(String scoreDataFile) throws FileNotFoundException {
		this.scoreDataFile = scoreDataFile;
		InputStream inputFile = new FileInputStream(this.scoreDataFile);
		this.fileReader = new Scanner(inputFile);
		this.scoreList = new ArrayList<>();
	}

	@Override
	public void loadScoreData() {
		fileReader.nextLine();
		while (fileReader.hasNext()) {
			String[] arr = fileReader.nextLine().split(",");
			ScoreDto one = new ScoreDto();
			one.sc_num = arr[Contract.Score.학번];
			one.sc_kor = Integer.valueOf(arr[Contract.Score.국어]);
			one.sc_eng = Integer.valueOf(arr[Contract.Score.영어]);
			one.sc_math = Integer.valueOf(arr[Contract.Score.수학]);
			one.sc_music = Integer.valueOf(arr[Contract.Score.음악]);
			one.sc_art = Integer.valueOf(arr[Contract.Score.미술]);
			one.sc_sw = Integer.valueOf(arr[Contract.Score.소프트웨어공학]);
			one.sc_db = Integer.valueOf(arr[Contract.Score.데이터베이스]);

			this.scoreList.add(one);
		}
	}
	
	/*
	 * ==============================
	 * 성적표
	 * ---------------------
	 * 학번 국어 영어 수학 ... 총점 평균 
	 * ----------------------
	 * 
	 * ===============================
	 * 
	 */
	@Override
	public void printScoreList() {
		for (ScoreDto one : this.scoreList) {
			System.out.println(Line.dLine(100));
			System.out.println(" 성적표");
			System.out.println(Line.sLine(100));
			System.out.println(" 학번 국어 영어 수학 음악 미술 SW DB 총점 평균");
			System.out.println(Line.sLine(100));
			System.out.printf("%s  %d   %d   %d   %d   %d  %d %d %d %.2f \n",one.sc_num, one.sc_kor, one.sc_eng, one.sc_math, one.sc_music, one.sc_art, one.sc_sw, one.sc_db, one.total(), one.average());
			System.out.println(Line.dLine(100));
		}
	}

}
