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
	protected String[] scoreTitle;

	public ScoreServiceImplV1(String scoreDataFile) throws FileNotFoundException {
		this.scoreDataFile = scoreDataFile;
		InputStream inputFile = new FileInputStream(this.scoreDataFile);
		this.fileReader = new Scanner(inputFile);
		this.scoreList = new ArrayList<>();
	}

	@Override
	public void loadScoreData() {
		scoreTitle = fileReader.nextLine().split(",");
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
		int[] subjectTotal = new int[scoreTitle.length];
//		int korTotal = 0;
//		int engTotal = 0;
//		int mathTotal = 0;
//		int musicTotal = 0;
//		int artTotal = 0;
//		int swTotal =0;
//		int dbTotal =0;
//		float avgTotal =0;
		for (ScoreDto one : this.scoreList) {
			System.out.println(Line.dLine(100));
			System.out.println("\t\t\t\t성적표");
			System.out.println(Line.sLine(100));
			for(String title : scoreTitle) {
				System.out.print(title+"\t");
			}
			System.out.print("총점\t평균");
			System.out.println("\n"+Line.sLine(100));
			System.out.printf("%5s\t%4d \t%4d \t%4d \t%d \t%4d \t%4d \t%4d \t%5d \t%.2f \n",one.sc_num, one.sc_kor, one.sc_eng, one.sc_math, one.sc_music, one.sc_art, one.sc_sw, one.sc_db, one.total(), one.average());
			System.out.println(Line.dLine(100));
//			korTotal += one.sc_kor;
//			engTotal += one.sc_eng;
//			mathTotal += one.sc_math;
//			musicTotal += one.sc_music;
//			artTotal += one.sc_art;
//			swTotal += one.sc_sw;
//			dbTotal += one.sc_db;
//			avgTotal += one.average();
			
			subjectTotal[Contract.Score.국어] += one.sc_kor;
			subjectTotal[Contract.Score.영어] += one.sc_eng;
			subjectTotal[Contract.Score.수학] += one.sc_math;
			subjectTotal[Contract.Score.음악] += one.sc_music;
			subjectTotal[Contract.Score.미술] += one.sc_art;
			subjectTotal[Contract.Score.소프트웨어공학] += one.sc_sw;
			subjectTotal[Contract.Score.데이터베이스] += one.sc_db;

		}
		System.out.println(Line.sLine(100));
		System.out.print("\t");
		float avgTotal = 0;
		for(int i = 1; i<subjectTotal.length; i++) {
			float subjectAvg = (float)subjectTotal[i] / scoreList.size();
			System.out.printf("%.2f\t", subjectAvg);
			avgTotal += subjectAvg;
		}
		System.out.printf("\t\t%.2f", avgTotal/(subjectTotal.length-1));
		System.out.println("\n"+Line.dLine(100));
		
//		float avgKor = (float)korTotal/scoreList.size();
//		float avgEng = (float)engTotal/scoreList.size();
//		float avgMath = (float)mathTotal/scoreList.size();
//		float avgMusic = (float)musicTotal/scoreList.size();
//		float avgArt = (float)artTotal/scoreList.size();
//		float avgSw = (float)swTotal/scoreList.size();
//		float avgDb = (float)dbTotal/scoreList.size();
//		float avgAvg = (float)avgTotal/scoreList.size();
		
//		System.out.println(Line.sLine(100));
//		System.out.printf("\t %.2f %.2f %.2f %.2f %.2f %.2f %.2f \t %.2f \n", avgKor, avgEng, avgMath, avgMusic, avgArt, avgSw, avgDb, avgAvg);
//		System.out.println(Line.dLine(100));
	}

}
