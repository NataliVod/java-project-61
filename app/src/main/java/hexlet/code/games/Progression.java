package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utility;

public class Progression {
    static final int MAX_ROUNDS = 3;
    static final int MAX_NUMBER = 100;
    static final int MAX_NUMBERS = 15;
    static final int MIN_NUMBERS = 5;
    public static void playGame() {
        String gameRules = "What number is missing in the progression?";
        String[][] rightAnswers = generateQuestionsAndRightAnswers();
        Engine.startGame(gameRules, rightAnswers);
    }
    private static String[][] generateQuestionsAndRightAnswers() {
        String[][] result = new String[MAX_ROUNDS][2];
        for (var i = 0; i < MAX_ROUNDS; i++) {
            result[i] = generateProgression(); //
        }
        return result;
    }

    private static String[] generateProgression() {         //считаем
        var length = Utility.getRandomNumber(MIN_NUMBERS, MAX_NUMBERS);
        String[] result = new String[2];
        var firstNumber = Utility.getRandomNumber(1, MAX_NUMBER);
        var progressionStep = Utility.getRandomNumber(2, MAX_NUMBER);
        var position = Utility.getRandomNumber(0, length);
        result[0] = "Question: " + firstNumber + " ";
        var nextNumber = firstNumber;
        for (var i = 0; i < length; i++) {
            nextNumber = nextNumber + progressionStep;
            if (i == position) {
                result[1] = nextNumber + "";
                result[0] = result[0] + ".." + " ";
            } else {
                result[0] = result[0] + nextNumber + " ";
            }
        }

        return result;
    }

}
