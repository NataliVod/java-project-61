package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utility;

public class GCD {
    static final int MAX_ROUNDS = 3;
    static final int MAX_NUMBER = 100;
    public static void playGame() {
        String gameRules = "Find the greatest common divisor of given numbers.";
        String[][] rightAnswers = generateRightAnswers();
        Engine.startGame(gameRules, rightAnswers);
    }
    private static String[][] generateRightAnswers() {
        String[][] result = new String[MAX_ROUNDS][2];
        for (var i = 0; i < MAX_ROUNDS; i++) {
            result[i] = findGCD(); //
        }
        return result;
    }

    private static String[] findGCD() {         //считаем
        String[] result = new String[2];
        var number1 = Utility.getRandomNumber(1, MAX_NUMBER);
        var number2 = Utility.getRandomNumber(1, MAX_NUMBER);
        result[0] = "Question: " + number1 + " " + number2 + " ";
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
