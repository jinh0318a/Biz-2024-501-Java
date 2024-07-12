package com.callor.score.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.models.ScoreDto;
import com.callor.score.service.ScoreService;

/*
 * 생성자를 통해서 score.txt 파일의 경로 주입받기
 * Scanner 를 사용하여 파일을 읽을 수 있도록 준비
 * 클래스 영역에 List<ScoreDto> scoreList 객체 선언하기
 * 생성자에서 scoreList 객체 초기화 하기
 * loadScoreData() 에서 파일을 읽어 scoreList 객체에 추가하기
 */
public class ScoreServiceImplV1 implements ScoreService {

	protected final String file;
	protected Scanner scan;
	protected List<ScoreDto> scoreList = null;

	public ScoreServiceImplV1(String file) throws FileNotFoundException {
		this.file = file;
		InputStream inputFile = null;
		inputFile = new FileInputStream(this.file);
		this.scan = new Scanner(inputFile);
		this.scoreList = new ArrayList<ScoreDto>();

	}

	@Override
	public void loadScoreData() {
		scan.nextLine();
		while (scan.hasNext()) {
			String[] arr = scan.nextLine().split(",");
			ScoreDto one = new ScoreDto();
			one.sc_num = arr[0];
			one.sc_kor = Integer.valueOf(arr[1]);
			one.sc_eng = Integer.valueOf(arr[2]);
			one.sc_math = Integer.valueOf(arr[3]);
			one.sc_music = Integer.valueOf(arr[4]);
			one.sc_art = Integer.valueOf(arr[5]);
			one.sc_sw = Integer.valueOf(arr[6]);
			one.sc_db = Integer.valueOf(arr[7]);

			this.scoreList.add(one);
		}
	}

	@Override
	public void printScoreList() {
		for (ScoreDto one : this.scoreList) {
			System.out.println(one.toString());
		}
	}

}
