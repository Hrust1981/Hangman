public class Main {
    public static void main(String[] args) {
        boolean isGame = true;
        Game game = new Game();
        Render render = new Render();
        while (isGame) {
            render.greeting();
            String data1 = game.dataInput("");
            if (data1.equals("0")) {
                isGame = false;
            } else if (data1.equals("1")) {
                Word getWord = new WordImpl(new DictionaryImpl(), new LetterImpl());
                String guessWord = getWord.getGuessWord();
                String guessMeaning = getWord.getGuessMeaningWord();

                char[] maskedWord = guessWord.replaceAll("[А-Я]", "*").toCharArray();
                render.startGame(guessMeaning, maskedWord);

                Letter findLetters = new LetterImpl();

                int countOfFail;
                boolean isContinueGame = true;
                while (isContinueGame) {
                    String string = "Введи букву, только кириллица: ";
                    String data2 = game.dataInput(string);
                    char letter = data2.toUpperCase().charAt(0);
                    String word = findLetters.letterSearch(guessWord, letter, maskedWord);
                    countOfFail = findLetters.getCountOfFail();
                    render.startWordGuessing(guessMeaning, word, findLetters.getUsedLetters(), countOfFail);
                    isContinueGame = game.gameOverCheck(word, countOfFail);
                }
            } else {
                System.out.println("Введите корректное значение!");
                game.sleep(3000);
            }
        }
    }
}