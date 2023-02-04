package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static final int MIN_NUMBERS = 5;
    private static final int MAX_NUMBERS = 15;
    private static final String GAME_DESCRIPTION = "What number is missing in the progression?";

    public static void playGame() {
        String[][] rightAnswers = generateQuestionsAndRightAnswers();
        Engine.startGame(GAME_DESCRIPTION, rightAnswers);
    }
    private static String[][] generateQuestionsAndRightAnswers() {
        String[][] result = new String[Engine.MAX_ROUNDS][2];
        for (String[] row :result) {
            var progressionLength = Utils.getRandomNumber(MIN_NUMBERS, MAX_NUMBERS);
            var firstNumber = Utils.getRandomNumber(MIN_NUMBER, MAX_NUMBER);
            var progressionStep = Utils.getRandomNumber(MIN_NUMBER + 1, MAX_NUMBER);
            var hiddenIndex = Utils.getRandomNumber(0, progressionLength);
            String[] progression = makeProgression(progressionLength, firstNumber, progressionStep);
            row[1] = progression[hiddenIndex];
            progression[hiddenIndex] = "..";
            row[0] = String.join(" ", progression);
        }
        return result;
    }

    private static String[] makeProgression(int length, int firstNumber, int progressionStep) {
        String[] result = new String[length];
        var nextNumber = firstNumber;
        for (var i = 0; i < result.length; i++) {
            result[i] = nextNumber + "";
            nextNumber = nextNumber + progressionStep;
        }
        return result;
    }

}
