import java.util.List;

public interface Letter {
    public int getCountOfFail();
    public List<Character> getUsedLetters();
    public char getRandomCyrillicLetter();
    String letterSearch(String word, char letter, char[] maskedWord);

}
