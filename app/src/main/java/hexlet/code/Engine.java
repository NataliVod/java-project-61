package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static boolean startGame(String gameRules, String[][] rightAnswers) {

        var counter = 0;
        boolean win = false;
        var numberOfRounds = 3;
        System.out.println(gameRules);
        for (var i = 0; i < numberOfRounds; i++) {
            var winThisRound = playRound(rightAnswers[i][0], rightAnswers[i][1]);
            if (!winThisRound) {
                break;
            }
            counter++;
        }
        if (counter == numberOfRounds) {
            win = true;
        }
        return win;
    } // 3 рануда игры
    private static boolean playRound(String question, String rightAnswer) {
        System.out.println(question);
        System.out.print("Your answer: ");
        var playerAnswer = getPlayerAnswer();
        var result = playerAnswer.equals(rightAnswer);
        reactToPlayerAnswer(result, playerAnswer, rightAnswer);
        return result;
    } // один круг игры
    private static String getPlayerAnswer() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    } // ответ игрока
    private static void reactToPlayerAnswer(boolean isRightAnswer, String playerAnswer, String rightAnswer) {
        if (isRightAnswer) {
            System.out.println("Correct!");
        } else {
            System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'%n", playerAnswer, rightAnswer);
        }
    } // сообщение после ответа игрока

    public static void endGame(boolean win, String playerName) {
        if (win) {
            System.out.println("Congratulations, " + playerName + "!");
        } else {
            System.out.println("Let's try again, " + playerName + "!");
        }
    } // сообщение в конце игры
}
