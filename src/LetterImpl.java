import java.util.ArrayList;
import java.util.List;

public class LetterImpl implements Letter {
    private int numberOfFail;
    private List<Character> usedLetters = new ArrayList<>();

    public int getCountOfFail() {
        return numberOfFail;
    }

    public List<Character> getUsedLetters() {
        return usedLetters;
    }

    public char getRandomCyrillicLetter() {
        String cyrillicLetters = "АБВГДЕЖЗИКЛМНО"; //АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ
        int index = (int)(cyrillicLetters.length() * Math.random());
        return cyrillicLetters.charAt(index);
    }

    public String letterSearch(String word, char letter, char[] maskedWord) {
        int index = 0;
        boolean isFail = true;
        char[] chars = word.toCharArray();
        for (char c: chars) {
            if (c == letter) {
                maskedWord[index] = letter;
                isFail = false;
            }
            index++;
        }
        countingFailures(isFail, letter);
        addingUsedLetter(letter);
        return String.valueOf(maskedWord);
    }

    private void countingFailures(boolean isFail, char letter) {
        if (isFail && !usedLetters.contains(letter)) {
            numberOfFail++;
        }
    }

    private void addingUsedLetter(char letter) {
        if (!usedLetters.contains(letter)) {
            usedLetters.add(letter);
        }
    }
}