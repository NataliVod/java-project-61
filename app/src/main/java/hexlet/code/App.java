package hexlet.code;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        playGame(chooseGameNumber());
    }
    public static int chooseGameNumber() { // нужен ли этот метод?
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static void playGame(int gameNumber) {
        switch (gameNumber) {
            case 0:
                break;
            case 1:
                var playerName = Greeter.getPlayerName();
                Greeter.sayHello(playerName);
                break;
            case 2:
                playerName = Greeter.getPlayerName(); // убрать повтор
                Greeter.sayHello(playerName);
                var win = Even.startGame();
                Greeter.endGame(win, playerName);
                break;
            default:
                System.out.println("wrong number");
        }
    }
}
