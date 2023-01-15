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
        System.out.println("Please enter the game number and press Enter."); //меню
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        playGame(chooseGameNumber());
    }
    public static int chooseGameNumber() {        //выбор игры
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    private static void playGame(int gameNumber) { //игра
        switch (gameNumber) {
            case 0:
                break; // выходим
            case GREET_GAME:
                Cli.sayHello(); // приветствие
                break;
            case EVEN_GAME:
                Even.playGame(); // четное/нечетное
                break;
            case CALC_GAME:
                Calc.playGame(); // калькулятор
                break;
            case GCD_GAME:
                GCD.playGame(); // НОД
                break;
            case PROGRESSION_GAME:
                Progression.playGame(); // прогрессия
                break;
            case PRIME_GAME:
                Prime.playGame(); // простое число
                break;
            default:
                System.out.println("wrong number"); // а если не номер ?
        }
    }
}
