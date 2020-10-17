package main;

import java.util.ArrayList;
import java.util.Arrays;

public class Shiritori {
    private ArrayList<String> words = new ArrayList<>();
    private boolean gameOver;

    public void runGame(String[] words) {
        for (String word:words) {
            word = word.trim();
            if (gameOver || !word.chars().allMatch(Character::isLetter)) {
                System.out.println(endGame()); return; }
            System.out.println(play(word));
        }
    }
    private boolean canAdd(String word) {
        if(words.isEmpty()) return true;
        if(words.contains(word)) return false;
        var lastWord = words.get(words.size() - 1).toLowerCase();
        return word.toLowerCase().charAt(0) == lastWord.charAt(lastWord.length() - 1);
    }
    private String endGame() {
        gameOver = true;
        return "GameOver";
    }
    private String correctWord(String word) {
        words.add(word);
        return "Correct word. Used words: " + getWords();
    }

    private String play(String word) {
        return canAdd(word) ? correctWord(word) : endGame();
    }

    private String getWords() {
        return Arrays.toString(words.toArray());
    }
    public String restart() {
        words.clear();
        gameOver = false;
        return "Game restarted";
    }

    public void setWords(ArrayList<String> words) {
        this.words = words;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }
}
