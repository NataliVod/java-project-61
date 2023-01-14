package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter."); //меню
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        playGame(chooseGameNumber());
    }
    public static int chooseGameNumber() {        //выбор игры
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static void playGame(int gameNumber) { //игра
        switch (gameNumber) {
            case 0:
                break; // выходим
            case 1:
                Cli.sayHello(); // так и не поняла должен ли кли быть в финальном варианте
                break;
            case 2:
                Even.playGame(); // четное/нечетное
                break;
            case 3:
                Calc.playGame(); // калькулятор
                break;
            case 4:
                GCD.playGame(); // НОД
                break;
            case 5:
                Progression.playGame(); // Прогрессия
                break;
            default:
                System.out.println("wrong number"); // а если не номер ?
        }
    }
}
