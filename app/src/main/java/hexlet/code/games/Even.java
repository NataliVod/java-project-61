package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utility;

public class Even {
    static final int MAX_NUMBER = 100000;

    public static void playGame() {
        String gameRules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] rightAnswers = generateQuestionsAndRightAnswers();
        Engine.startGame(gameRules, rightAnswers);
    }

    private static String[][] generateQuestionsAndRightAnswers() {
        String[][] result = new String[Engine.MAX_ROUNDS][2];
        for (var i = 0; i < result.length; i++) {
            var number = Utility.getRandomNumber(1, MAX_NUMBER);
            result[i] = getNumberAndParity(number);
        }
        return result;
    }

    private static String[] getNumberAndParity(int number) {         //пара вопрос-ответ
        String yesAnswer = "yes";
        String noAnswer = "no";
        String[] result = new String[2];
        result[0] = "Question: " + number + " ";
        result[1] = isEven(number) ? yesAnswer : noAnswer;
        return result;
    }

    private static boolean isEven(int number) {
        return (number % 2 == 0);
    }
}
