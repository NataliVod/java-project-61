package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utility;

public class Calc {

    static final int MAX_NUMBER = 100;
    static final int ADDITION_SYMBOL = 1;
    static final int SYBSTRACTION_SYMBOL = 2;
    static final int DIVISION_SYMBOL = 3;

    public static void playGame() {
        String gameRules = "What is the result of the expression?";
        String[][] rightAnswers = generateQuestionsAndRightAnswers();
        Engine.startGame(gameRules, rightAnswers);
    }

    private static String[][] generateQuestionsAndRightAnswers() {
        String[][] result = Utility.generateEmptyArray();
        for (var i = 0; i < result.length; i++) {
            var number1 = Utility.getRandomNumber(1, MAX_NUMBER);
            var number2 = Utility.getRandomNumber(1, MAX_NUMBER);
            var operator = Utility.getRandomNumber(ADDITION_SYMBOL, DIVISION_SYMBOL);
            result[i] = calculate(number1, number2, operator);
        }
        return result;
    }

    private static String[] calculate(int number1, int number2, int operator) {
        String[] result = new String[2];
        String operatorSymbol = "";
        int resultNumber = 0;
        switch (operator) {
            case ADDITION_SYMBOL -> {
                operatorSymbol = " + ";
                resultNumber = number1 + number2;
            }

            case SYBSTRACTION_SYMBOL -> {
                operatorSymbol = " - ";
                resultNumber = number1 - number2;
            }

            case DIVISION_SYMBOL -> {
                operatorSymbol = " * ";
                resultNumber = number1 * number2;
            }

            default -> {
            }
        }
        result[0] = "Question: " + number1 + operatorSymbol + number2 + " ";
        result[1] = String.valueOf(resultNumber);
        return result;
    }

}


