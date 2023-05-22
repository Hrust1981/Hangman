import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Game {
    private boolean isContinueGame = true;

    public boolean gameOverCheck(@NotNull String word, int countOfFail) {
        isContinueGame = true;
        if (!word.contains("*")) {
            printMessage("Молодец, ты выиграл!!\n");
        } else if (countOfFail == 6) {
            printMessage("Не отчаивайся, попробуй еще раз!\n");
        }
        return isContinueGame;
    }

    public String dataInput(String string) {
        System.out.print(string);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public void sleep(int delayTime) {
        try {
            Thread.sleep(delayTime);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void printMessage(String string) {
        System.out.println(string);
        isContinueGame = false;
        sleep(3000);
    }
}
