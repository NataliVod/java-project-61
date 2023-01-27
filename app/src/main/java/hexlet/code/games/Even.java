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
        String[][] result = Utility.generateEmptyArray();
        for (var i = 0; i < result.length; i++) {
            var number = Utility.getRandomNumber(1, MAX_NUMBER);
            result[i] = getNumberAndParity(number);
        }
        return result;
    } // набор данных для движка

    private static String[] getNumberAndParity(int number) {         //пара вопрос-ответ
        String[] result = new String[2];
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
