package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

class App {
    static final int GREET_GAME = 1;
    static final int EVEN_GAME = 2;
    static final int CALC_GAME = 3;
    static final int GCD_GAME = 4;
    static final int PROGRESSION_GAME = 5;
    static final int PRIME_GAME = 6;

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        playNewGame(chooseGameNumber());
    }
    public static int chooseGameNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    private static void playNewGame(int gameNumber) {
        switch (gameNumber) {
            case 0 -> {
            }
            case GREET_GAME -> Cli.sayHello();
            case EVEN_GAME -> Even.playGame();
            case CALC_GAME -> Calc.playGame();
            case GCD_GAME ->   GCD.playGame();
            case PROGRESSION_GAME -> Progression.playGame();
            case PRIME_GAME ->  Prime.playGame();
            default ->  System.out.println("wrong input");
        }
    }
}
