import java.util.Map;
import java.util.Optional;

public class WordImpl implements Word {
    private final Dictionary dictionary;
    private final Letter letter;
    private String guessWord;
    private String guessMeaning;

    public WordImpl(Dictionary dictionary, Letter letter) {
        this.dictionary = dictionary;
        this.letter = letter;
        withdrawalData();
    }

    public Optional<Map.Entry<String, String>> getRandomWordAndMeaning() {
        char searchLetter = letter.getRandomCyrillicLetter();
        return dictionary.getDictionary().entrySet().stream().
                parallel().filter(k -> k.getKey().charAt(0) == searchLetter).findAny();
    }

    public String getGuessWord() {
        return getStringValue(guessWord);
    }

    public String getGuessMeaningWord() {
        return getStringValue(guessMeaning);
    }

    private void withdrawalData() {
        var data = getRandomWordAndMeaning();
        if (data.isPresent()) {
            guessWord = data.get().getKey();
            guessMeaning = data.get().getValue();
        }
    }

    private String getStringValue(String string) {
        if (getRandomWordAndMeaning().isEmpty()) return null;
        return string;
    }
}
