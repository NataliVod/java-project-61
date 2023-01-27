package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utility;

public class Progression {
    static final int MAX_NUMBER = 100;
    static final int MAX_NUMBERS = 15;
    static final int MIN_NUMBERS = 5;

    public static void playGame() {
        String gameRules = "What number is missing in the progression?";
        String[][] rightAnswers = generateQuestionsAndRightAnswers();
        Engine.startGame(gameRules, rightAnswers);
    }
    private static String[][] generateQuestionsAndRightAnswers() {
        String[][] result = Utility.generateEmptyArray();
        for (var i = 0; i < result.length; i++) {
            var progressionLength = Utility.getRandomNumber(MIN_NUMBERS, MAX_NUMBERS);
            var firstNumber = Utility.getRandomNumber(1, MAX_NUMBER);
            var progressionStep = Utility.getRandomNumber(2, MAX_NUMBER);
            var position = Utility.getRandomNumber(0, progressionLength);
            result[i] = generateProgressionWithSkip(progressionLength, firstNumber, progressionStep, position);
        }
        return result;
    }

    private static String[] generateProgressionWithSkip(int length, int firstNumber, int progressionStep, int position) {
        String[] result = new String[2];
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
