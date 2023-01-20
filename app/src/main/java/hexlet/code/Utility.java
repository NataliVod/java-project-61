package hexlet.code;

import java.util.Scanner;

public class Utility {

    public static int getRandomNumber(int minNumber, int maxNumber) {
        return (int) (Math.random() * (maxNumber - minNumber)) + minNumber;
    }


    public static String sayHello() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        var playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "!");
        return playerName;
    }

}


