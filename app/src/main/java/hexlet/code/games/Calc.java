package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Calc {

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static final String[] OPERATORS = {" + ", " - ", " * "};
    private static final String GAME_DESCRIPTION = "What is the result of the expression?";

    public static void playGame() {

        String[][] rightAnswers = generateQuestionsAndRightAnswers();
        Engine.startGame(GAME_DESCRIPTION, rightAnswers);
    }

    private static String[][] generateQuestionsAndRightAnswers() {
        String[][] result = new String[Engine.MAX_ROUNDS][2];
        for (String[] row : result) {
            var number1 = Utils.getRandomNumber(MIN_NUMBER, MAX_NUMBER);
            var number2 = Utils.getRandomNumber(MIN_NUMBER, MAX_NUMBER);
            var operatorNumber = Utils.getRandomNumber(0, OPERATORS.length);
            var operator = OPERATORS[operatorNumber];
            row[0] = number1 + operator + number2 + "";
            row[1] = String.valueOf(calculate(number1, number2, operator));
        }
        return result;
    }

    private static int calculate(int number1, int number2, String operator) {
        return  switch (operator) {
            case " + " -> number1 + number2;
            case " - " -> number1 - number2;
            case " * " -> number1 * number2;
            default -> throw new RuntimeException("Unknown input: " + operator);
        };

    }

}


