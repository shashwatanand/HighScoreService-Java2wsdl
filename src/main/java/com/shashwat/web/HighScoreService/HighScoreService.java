package com.shashwat.web.HighScoreService;

import java.util.ArrayList;
import java.util.List;

public class HighScoreService {
	public static List<HighScore> highScores = new ArrayList<HighScore>();

	public void addHighScore(HighScore score) {
		System.out.println("{addHighScore} Adding: [" + score.getNickName()
				+ " , " + score.getScore() + "]");
		highScores.add(score);
	}

	public List<HighScore> getHighScores() {
		System.out.println("{getHighScores} start");
		return highScores;
	}

	public List<HighScore> getHighScoreForNickname(String nickName) {
		System.out.println("{getHighScoreForNickname} start");
		List<HighScore> userScores = new ArrayList<HighScore>();

		for (HighScore highScore : highScores) {
			if (highScore.getNickName().equals(nickName)) {
				userScores.add(highScore);
			}
		}
		return userScores;
	}
	
	public int getHighScoreSize() {
		System.out.println("{getHighScoreSize} start");
		return highScores.size();
	}

}
