package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utility;

public class Prime {
    static final int MAX_ROUNDS = 3;
    static final int MAX_NUMBER = 1000;

    public static void playGame() {
        String gameRules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] rightAnswers = generateQuestionsAndRightAnswers();
        Engine.startGame(gameRules, rightAnswers);
    }

    private static String[][] generateQuestionsAndRightAnswers() {
        String[][] result = new String[MAX_ROUNDS][2];
        for (var i = 0; i < MAX_ROUNDS; i++) {
            result[i] = getNumberAndPrimality();
        }
        return result;
    } // набор данных для движка

    private static String[] getNumberAndPrimality() {         //пара вопрос-ответ
        String[] result = new String[2];
        var number = Utility.getRandomNumber(1, MAX_NUMBER);
        result[0] = "Question: " + number + " ";
        result[1] = isPrime(number);
        return result;
    }

    private static String isPrime(int number) {
        var result = true;
        for (var i = 2; i < number; i++) {
            if (number % i == 0) {
                result = false;
                break;
            }
        }
        return result ? "yes" : "no";
    }
}
