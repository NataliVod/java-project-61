package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greeter;

public class Prime {
    public static void playGame() {
        var playerName = Greeter.getPlayerName();
        Greeter.sayHello(playerName);
        String gameRules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] rightAnswers = generateRightAnswers();
        var win = Engine.startGame(gameRules, rightAnswers);
        Engine.endGame(win, playerName);
    }
    private static String[][] generateRightAnswers() {
        var numberOfRounds = 3;
        String[][] result = new String[numberOfRounds][2];
        for (var i = 0; i < numberOfRounds; i++) {
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
        var maxNumber = 1000;
        return (int) (Math.random() * (maxNumber - 1)) + 1;
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
