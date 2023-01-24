package hexlet.code;

import java.util.Scanner;

public class Engine {
    static final int MAX_ROUNDS = 3;

    public static void startGame(String gameRules, String[][] questionsAndRightAnswers) {
        var playerName = sayHello();
        System.out.println(gameRules);
        for (var i = 0; i < MAX_ROUNDS; i++) {
            var winThisRound = playRound(questionsAndRightAnswers[i][0], questionsAndRightAnswers[i][1]);
            if (!winThisRound) {
                System.out.println("Let's try again, " + playerName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + playerName + "!");
    } // 3 рануда игры

    private static boolean playRound(String question, String rightAnswer) {
        System.out.println(question);
        System.out.print("Your answer: ");
        Scanner scanner = new Scanner(System.in);
        var playerAnswer = scanner.nextLine();
        var roundResult = playerAnswer.equals(rightAnswer);
        if (roundResult) {
            System.out.println("Correct!");
        } else {
            System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'%n", playerAnswer, rightAnswer);
        }
        return roundResult;
    } // один круг игры

    private static String sayHello() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        var playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "!");
        return playerName;
    }

}
