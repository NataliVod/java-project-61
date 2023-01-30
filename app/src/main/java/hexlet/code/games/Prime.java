package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utility;

public class Prime {
    static final int MAX_NUMBER = 1000;

    public static void playGame() {
        String gameRules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] rightAnswers = generateQuestionsAndRightAnswers();
        Engine.startGame(gameRules, rightAnswers);
    }

    private static String[][] generateQuestionsAndRightAnswers() {
        String[][] result = new String[Engine.MAX_ROUNDS][2];
        for (var i = 0; i < result.length; i++) {
            var number = Utility.getRandomNumber(1, MAX_NUMBER);
            result[i] = getNumberAndPrimality(number);
        }
        return result;
    }

    private static String[] getNumberAndPrimality(int number) {         //пара вопрос-ответ
        String yesAnswer = "yes";
        String noAnswer = "no";
        String[] result = new String[2];
        result[0] = "Question: " + number + " ";
        result[1] = isPrime(number) ? yesAnswer : noAnswer;
        return result;
    }

    private static boolean isPrime(int number) {
        var result = true;
        for (var i = 2; i < number; i++) {
            if (number % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
