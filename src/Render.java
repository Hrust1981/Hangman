import java.util.List;

public class Render {
    private StringBuilder string;

    public void greeting() {
        System.out.println("Приветствую, ты запустил игру ВИСЕЛИЦА,\n" +
                "чтобы начать игру нажми на 1, если хочешь выйти жми 0!");
    }

    public void startGame(String guessMeaning, char[] maskedWord) {
        string = new StringBuilder();
        string.append("Угадай слово вводя по одной букве\n")
                .append("Определение: ").append(guessMeaning).append("\n")
                .append(maskedWord);
        System.out.println(string);
    }

    public void startWordGuessing(String definitionOfGuessWord, String maskedGuessWord,
                                  List<Character> enteredLetters, int numberOfFailures) {
        string = new StringBuilder();
        string.append("Определение: ").append(definitionOfGuessWord).append("\n")
                .append(maskedGuessWord).append("\n")
                .append("Использованные буквы: ").append(enteredLetters).append("\n")
                .append("Кол-во неудачных попыток: ").append(numberOfFailures).append("\n");
        System.out.println(string);
        System.out.println(gallowsRendering(numberOfFailures));
    }

    public String gallowsRendering(int numberOfFail) {
        String gallows = "";
        switch (numberOfFail) {
            case 1 -> gallows = """
                       |----|
                       |    0
                       |
                       |
                    ___|___""";
            case 2 -> gallows = """
                       |----|
                       |    0
                       |    |
                       |
                    ___|___""";
            case 3 -> gallows = """
                       |----|
                       |    0
                       |   /|
                       |
                    ___|___""";
            case 4 -> gallows = """
                       |----|
                       |    0
                       |   /|\\
                       |
                    ___|___""";
            case 5 -> gallows = """
                       |----|
                       |    0
                       |   /|\\
                       |   /
                    ___|___""";
            case 6 -> gallows = """
                       |----|
                       |    0
                       |   /|\\
                       |   / \\
                    ___|___""";
            default -> gallows = """
                       |----|
                       |
                       |
                       |
                    ___|___""";
        }
        return gallows;
    }
}
