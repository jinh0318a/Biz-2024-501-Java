package com.callor.word.models;

/*
 * 영어단어, 한글 풀이를 저장할 Data Class
 * 
 */
public class WordVO {
	
	public String english;
	public String korean;
	
	
	public WordVO() {
		
	}


	public WordVO(String english, String korean) {
		this.english = english;
		this.korean = korean;
	}


	@Override
	public String toString() {
		return "WordVO [english=" + english + ", korean=" + korean + "]";
	}
	
	
}
