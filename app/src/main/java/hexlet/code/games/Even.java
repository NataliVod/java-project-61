package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utility;

public class Even {
    static final int MAX_ROUNDS = 3;
    static final int MAX_NUMBER = 100000;

    public static void playGame() {
        String gameRules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] rightAnswers = generateRightAnswers();
        Engine.startGame(gameRules, rightAnswers);
    }
    private static String[][] generateRightAnswers() {
        String[][] result = new String[MAX_ROUNDS][2];
        for (var i = 0; i < MAX_ROUNDS; i++) {
            result[i] = defineIfPrime();
        }
        return result;
    } // набор данных для движка

    private static String[] defineIfPrime() {         //пара вопрос-ответ
        String[] result = new String[2];
        var number = Utility.getRandomNumber(1, MAX_NUMBER);
        result[0] = "Question: " + number + " ";
        result[1] = isEven(number);

        return result;
    }

    private static String isEven(int number) {
        if (number % 2 == 0) {
            return "yes";
        }
        return "no";
    }
}
