package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greeter;

public class Calc {

    static final int MAX_ROUNDS = 3;
    static final int MAX_NUMBER = 100;

    public static void playGame() {
        var playerName = Greeter.getPlayerName();
        Greeter.sayHello(playerName);
        String gameRules = "What is the result of the expression?";
        String[][] rightAnswers = generateRightAnswers();
        var win = Engine.startGame(gameRules, rightAnswers);
        Engine.endGame(win, playerName);
    }
    private static String[][] generateRightAnswers() {
        String[][] result = new String[MAX_ROUNDS][2];
        for (var i = 0; i < MAX_ROUNDS; i++) {
            result[i] = calculate(); //
        }
        return result;
    }
    private static String[] calculate() {         //считаем
        String[] result = new String[2];
        var number1 = getRandomOperand();
        var number2 = getRandomOperand();
        var operator = getRandomOperator();
        switch (operator) {
            case 1:
                result[0] = "Question: " + number1 + " + " + number2 + " ";
                result[1] = String.valueOf(number1 + number2);
                break;
            case 2:
                result[0] = "Question: " + number1 + " - " + number2 + " ";
                result[1] = String.valueOf(number1 - number2);
                break;
            case 3:
                result[0] = "Question: " + number1 + " * " + number2 + " ";
                result[1] = String.valueOf(number1 * number2);
                break;
            default:
                break;
        }
        return result;
    }
    private static int getRandomOperand() {
        return (int) (Math.random() * (MAX_NUMBER - 1)) + 1;
    }
    private static int getRandomOperator() {
        return  (int) (Math.random() * 2) + 1;
    } // 1 для +, 2 для -, 3 для *


}


