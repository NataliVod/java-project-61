package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greeter;

public class GCD {
    public static void playGame() {
        var playerName = Greeter.getPlayerName();
        Greeter.sayHello(playerName);
        String gameRules = "Find the greatest common divisor of given numbers.";
        String[][] rightAnswers = generateRightAnswers();
        var win = Engine.startGame(gameRules, rightAnswers);
        Engine.endGame(win, playerName);
    }
    private static String[][] generateRightAnswers() {
        var numberOfRounds = 3;
        String[][] result = new String[numberOfRounds][2];
        for (var i = 0; i < numberOfRounds; i++) {
            result[i] = answer(); //
        }
        return result;
    }

    private static String[] answer() {         //считаем
        String[] result = new String[2];
        var number1 = getRandomNumber();
        var number2 = getRandomNumber();
        result[0] = "Question: " + number1 + " " + number2 + " ";
        result[1] = findGCD(number1, number2) + "";

        return result;
    }
    private static int getRandomNumber() {
        var maxNumber = 100;
        return (int) (Math.random() * (maxNumber - 1)) + 1; // может поменять диапазон?
    }
    private static int findGCD(int number1, int number2) {
        while (number1 != 0 & number2 != 0) {
            if (number1 > number2) {
                number1 = number1 % number2;
            } else {
                number2 = number2 % number1;
            }
        }
        return number1 + number2;
    }
}
