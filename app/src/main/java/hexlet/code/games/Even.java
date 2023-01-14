package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greeter;

public class Even {

    public static void playGame() {
        var playerName = Greeter.getPlayerName();
        Greeter.sayHello(playerName);
        String gameRules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] rightAnswers = generateRightAnswers();
        var win = Engine.startGame(gameRules, rightAnswers);
        Engine.endGame(win, playerName);
    }
    public static String[][] generateRightAnswers() {
        String[][] result = new String[3][2];
        for (var i = 0; i < 3; i++) {
            result[i] = answer(); //
        }
        return result;
    }

    public static String[] answer() {         //считаем
        String[] result = new String[2];
        var number = getRandomNumber();
        result[0] = "Question: " + number + " ";
        result[1] = isEven(number);

        return result;
    }
    public static int getRandomNumber() {

        return (int) (Math.random() * 100000) + 1; // может поменять диапазон
    }
    public static String isEven(int number) {
        if (number % 2 == 0) {
            return "yes";
        }
        return "no";
    }
}
