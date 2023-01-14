package hexlet.code;

import java.util.Scanner;

public class Greeter {
    public static void sayHello(String playerName) {
        System.out.println("Hello, " + playerName + "!");
    }

    public static String getPlayerName() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
