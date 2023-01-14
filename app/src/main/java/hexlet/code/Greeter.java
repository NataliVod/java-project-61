package hexlet.code;

import java.util.Scanner;

class Greeter {
    public static void sayHello(String playerName) {
        System.out.println("Hello, " + playerName + "!");
    }
    public  static void endGame(boolean win, String playerName) {
        if (!win) {
            System.out.println("Let's try again, " + playerName + "!");
        } else {
            System.out.println("Congratulations, " + playerName + "!");
        }
    }
    public static String getPlayerName() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
