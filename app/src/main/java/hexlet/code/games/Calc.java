package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utility;

public class Calc {

    static final int MAX_ROUNDS = 3;
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
       String[][] result = new String[MAX_ROUNDS][2];
       for (var i = 0; i < MAX_ROUNDS; i++) {
           result[i] = calculate();
       }
        return result;
    }
    private static String[] calculate() {
        String[] result = new String[2];
        var number1 = Utility.getRandomNumber(1, MAX_NUMBER);
        var number2 = Utility.getRandomNumber(1, MAX_NUMBER);
        var operator = Utility.getRandomNumber(ADDITION_SYMBOL, DIVISION_SYMBOL);
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


