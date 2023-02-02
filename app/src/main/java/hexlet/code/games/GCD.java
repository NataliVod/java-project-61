package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static final String GAME_DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void playGame() {
        String[][] rightAnswers = generateQuestionsAndRightAnswers();
        Engine.startGame(GAME_DESCRIPTION, rightAnswers);
    }

    private static String[][] generateQuestionsAndRightAnswers() {
        String[][] result = new String[Engine.MAX_ROUNDS][2];
        for (var i = 0; i < result.length; i++) {
            var number1 = Utils.getRandomNumber(MIN_NUMBER, MAX_NUMBER);
            var number2 = Utils.getRandomNumber(MIN_NUMBER, MAX_NUMBER);
            result[i] = getNumbersAndGCD(number1, number2);
        }
        return result;
    }

    private static String[] getNumbersAndGCD(int number1, int number2) {         //пара вопрос-ответ
        String[] result = new String[2];
        result[0] = number1 + " " + number2;
        result[1] = findGCD(number1, number2) + "";
        return result;
    }

    private static int findGCD(int number1, int number2) {
        while (number1 != 0 & number2 != 0) {
            if (number1 > number2) {
                number1 = number1 % number2;
            } else {
                number2 = number2 % number1;
            }
        }
        return number1 + number2;
    }
}
