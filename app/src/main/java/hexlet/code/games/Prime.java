package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 1000;
    private static final String GAME_DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void playGame() {
        String[][] rightAnswers = generateQuestionsAndRightAnswers();
        Engine.startGame(GAME_DESCRIPTION, rightAnswers);
    }

    private static String[][] generateQuestionsAndRightAnswers() {
        String[][] result = new String[Engine.MAX_ROUNDS][2];
        for (var i = 0; i < result.length; i++) {
            var number = Utils.getRandomNumber(MIN_NUMBER, MAX_NUMBER);
            result[i] = getNumberAndPrimality(number);
        }
        return result;
    }

    private static String[] getNumberAndPrimality(int number) {         //пара вопрос-ответ
        String[] result = new String[2];
        result[0] = String.valueOf(number);
        result[1] = isPrime(number) ? "yes" : "no";
        return result;
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (var i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
