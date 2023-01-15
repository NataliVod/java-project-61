package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greeter;

public class Prime {
    static final int MAX_ROUNDS = 3;
    static final int MAX_NUMBER = 1000;
    public static void playGame() {
        var playerName = Greeter.getPlayerName();
        Greeter.sayHello(playerName);
        String gameRules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] rightAnswers = generateRightAnswers();
        var win = Engine.startGame(gameRules, rightAnswers);
        Engine.endGame(win, playerName);
    }
    private static String[][] generateRightAnswers() {
        String[][] result = new String[MAX_ROUNDS][2];
        for (var i = 0; i < MAX_ROUNDS; i++) {
            result[i] = answer();
        }
        return result;
    } // набор данных для движка

    private static String[] answer() {         //пара вопрос-ответ
        String[] result = new String[2];
        var number = getRandomNumber();
        result[0] = "Question: " + number + " ";
        result[1] = isPrime(number);

        return result;
    }
    private static int getRandomNumber() {
        return (int) (Math.random() * (MAX_NUMBER - 1)) + 1;
    }
    private static String isPrime(int number) {
        var result = true;
        for (var i = 2; i < number; i++) {
            if (number % i == 0) {
                result = false;
                break;
            }
        }
        return result ? "yes" : "no";
    }
}
