package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greeter;

public class Progression {
    public static void playGame() {
        var playerName = Greeter.getPlayerName();
        Greeter.sayHello(playerName);
        String gameRules = "What number is missing in the progression?";
        String[][] rightAnswers = generateRightAnswers();
        var win = Engine.startGame(gameRules, rightAnswers);
        Engine.endGame(win, playerName);
    }
    private static String[][] generateRightAnswers() {
        String[][] result = new String[3][2];
        for (var i = 0; i < 3; i++) {
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
        return (int) (Math.random() * 99) + 1;
    }

    private static int getRandomLength() {
        return (int) (Math.random() * 10) + 5;
    }

    private static int getRandomPosition(int length) {
        return (int) (Math.random() * (length));
    }
}
