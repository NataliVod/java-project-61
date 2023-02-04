package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100000;
    private static final String GAME_DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void playGame() {
        String[][] rightAnswers = generateQuestionsAndRightAnswers();
        Engine.startGame(GAME_DESCRIPTION, rightAnswers);
    }

    private static String[][] generateQuestionsAndRightAnswers() {
        String[][] result = new String[Engine.MAX_ROUNDS][2];
        for (var i = 0; i < result.length; i++) {
            var number = Utils.getRandomNumber(MIN_NUMBER, MAX_NUMBER);
            result[i] = getNumberAndParity(number);
        }
        return result;
    }

    private static String[] getNumberAndParity(int number) {         //пара вопрос-ответ
        String[] result = new String[2];
        result[0] = String.valueOf(number);
        result[1] = isEven(number) ? "yes" : "no";
        return result;
    }

    private static boolean isEven(int number) {
        return (number % 2 == 0);
    }
}
