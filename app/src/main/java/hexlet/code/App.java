package hexlet.code;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");
        playGame(chooseNumber());
    }
    public static int chooseNumber() { // нужен ли этот метод?
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static void playGame(int gameNumber) {
        if (gameNumber == 1) {
            System.out.println("Your choice: 1");
            System.out.println("Welcome to the Brain Games!");
            Cli.sayHello();
        } else if (gameNumber == 0) {
            System.out.println("Your choice: 0");
        } else {
            System.out.println("wrong number");
        }
    }
}
