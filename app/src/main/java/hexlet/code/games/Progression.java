package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greeter;

public class Progression {
    static final int MAX_ROUNDS = 3;
    static final int MAX_NUMBER = 100;
    static final int MAX_NUMBERS = 15;
    static final int MIN_NUMBERS = 5;
    public static void playGame() {
        var playerName = Greeter.getPlayerName();
        Greeter.sayHello(playerName);
        String gameRules = "What number is missing in the progression?";
        String[][] rightAnswers = generateRightAnswers();
        var win = Engine.startGame(gameRules, rightAnswers);
        Engine.endGame(win, playerName);
    }
    private static String[][] generateRightAnswers() {
        String[][] result = new String[MAX_ROUNDS][2];
        for (var i = 0; i < MAX_ROUNDS; i++) {
            result[i] = answer(); //
        }
        return result;
    }

    private static String[] answer() {         //считаем
        var length = getRandomLength();
        String[] result = new String[2];
        var firstNumber = getRandomNumber();
        var progressionStep = getRandomNumber() + 1; //чтобы не было шага 1
        var position = getRandomPosition(length);
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
    private static int getRandomNumber() {
        return (int) (Math.random() * (MAX_NUMBER - 1)) + 1;
    }

    private static int getRandomLength() {
        return (int) (Math.random() * (MAX_NUMBERS - MIN_NUMBERS)) + MIN_NUMBERS;
    }

    private static int getRandomPosition(int length) {
        return (int) (Math.random() * (length));
    }
}
