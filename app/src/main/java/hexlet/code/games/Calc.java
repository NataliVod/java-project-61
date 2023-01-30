package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utility;

public class Calc {

    static final int MAX_NUMBER = 100;

    public static void playGame() {
        String gameRules = "What is the result of the expression?";
        String[][] rightAnswers = generateQuestionsAndRightAnswers();
        Engine.startGame(gameRules, rightAnswers);
    }

    private static String[][] generateQuestionsAndRightAnswers() {
        String[][] result = new String[Engine.MAX_ROUNDS][2];
        for (var i = 0; i < result.length; i++) {
            String[] operators = {" + ", " - ", " * "};
            var number1 = Utility.getRandomNumber(1, MAX_NUMBER);
            var number2 = Utility.getRandomNumber(1, MAX_NUMBER);
            var operatorNumber = Utility.getRandomNumber(0, operators.length);
            var operator = operators[operatorNumber];
            result[i] = calculate(number1, number2, operator);
        }
        return result;
    }

    private static String[] calculate(int number1, int number2, String operator) {
        String[] result = new String[2];
        int resultNumber = switch (operator) {
            case " + " -> number1 + number2;
            case " - " -> number1 - number2;
            case " * " -> number1 * number2;
            default -> 0;
        };
        result[0] = "Question: " + number1 + operator + number2 + " ";
        result[1] = String.valueOf(resultNumber);
        return result;
    }

}


