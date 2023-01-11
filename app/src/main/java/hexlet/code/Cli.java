package hexlet.code;

import java.util.Scanner;

class Cli {
    public static void sayHello() {
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "!");
        scanner.close();
    }
}
