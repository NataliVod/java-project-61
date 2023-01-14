package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static boolean startGame(String gameRules, String[][] rightAnswers) {

        var counter = 0;
        boolean win = false;
        System.out.println(gameRules);
        for (var i = 0; i < 3; i++) {
            var winThisRound = playRound(rightAnswers[i][0], rightAnswers[i][1]);
            if (!winThisRound) {
                break;
            }
            counter++;
        }
        if (counter == 3) {
            win = true;
        }
        return win;
    }
    public static boolean playRound(String question, String rightAnswer) {
        System.out.println(question);
        System.out.print("Your answer: ");
        var playerAnswer = getPlayerAnswer();
        var result = playerAnswer.equals(rightAnswer);
        reactToPlayerAnswer(result, playerAnswer, rightAnswer);
        return result;
    }
    public static String getPlayerAnswer() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static void reactToPlayerAnswer(boolean isRightAnswer, String playerAnswer, String rightAnswer) {
        if (isRightAnswer) {
            System.out.println("Correct!");
        } else {
            System.out.printf("%s is wrong answer ;(. Correct answer was %s%n", playerAnswer, rightAnswer);
        }
    } // сообщение после ответа игрока, название неудачное - надо поменять

    public static void endGame(boolean win, String playerName) {
        if (win) {
            System.out.println("Congratulations, " + playerName + "!");
        } else {
            System.out.println("Let's try again, " + playerName + "!");
        }
    } // сообщение в конце игры
}
