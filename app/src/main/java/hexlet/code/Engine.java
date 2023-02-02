package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int MAX_ROUNDS = 3;

    public static void startGame(String gameDescription, String[][] questionsAndRightAnswers) {

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        Scanner scanner = new Scanner(System.in);
        var playerName = scanner.nextLine();

        System.out.println("Hello, " + playerName + "!");
        System.out.println(gameDescription);

        for (var i = 0; i < MAX_ROUNDS; i++) {

            var question = questionsAndRightAnswers[i][0];
            var rightAnswer = questionsAndRightAnswers[i][1];

            System.out.println("Question " + question + " ");
            System.out.print("Your answer: ");

            var playerAnswer = scanner.nextLine();
            var winThisRound = playerAnswer.equals(rightAnswer);

            if (winThisRound) {
                System.out.println("Correct!");

            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'%n", playerAnswer, rightAnswer);
                System.out.println("Let's try again, " + playerName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + playerName + "!");
    }

}
