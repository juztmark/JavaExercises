import java.util.ArrayList;
import java.util.Arrays;

public class Shiritori {
    private ArrayList<String> words = new ArrayList<>();
    private boolean gameOver;

    public void runGame(String[] words) {
        for (String word:words) {
            if (gameOver) return;
            System.out.println(play(word.trim().toLowerCase()));
        }
    }

    private String play(String word) {
        for (var i = 0; i < word.length(); i++) {
            if(!Character.isLetter(word.charAt(i))) {
                gameOver = true;
                return "GameOver";
            }
        }
        if(words.isEmpty()){
            words.add(word);
            return "Correct word. Used words: " + getWords();
        }
        var lastWord = words.get(words.size() - 1);
        if (word.charAt(0) == lastWord.charAt(lastWord.length() - 1)) {
            words.add(word);
            return "Correct word. Used words: " + getWords();
        }
        gameOver = true;
        return "GameOver";
    }

    public String getWords() {
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
