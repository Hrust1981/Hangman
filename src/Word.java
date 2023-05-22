import java.util.Map;
import java.util.Optional;

public interface Word {
    Optional<Map.Entry<String, String>> getRandomWordAndMeaning();
    String getGuessWord();
    String getGuessMeaningWord();
}
