package hexlet.code;

import java.util.Scanner;

class Even {
    public static boolean startGame() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");
        Scanner scanner = new Scanner(System.in);
        var counter = 0;
        boolean win = false;
        for (var i = 0; i < 3; i++) {
            var number = getRandomNumber();
            System.out.println(number);
            System.out.print("Your choice: ");
            var playerAnswer =  scanner.nextLine();
            var rightAnswer = isEven(number);
            var systemAnswer = isRightAnswer(playerAnswer, rightAnswer);
            System.out.println(systemAnswer);
            if (!(systemAnswer.equals("Correct!"))) { //создать переменные для ответов, сложить их куда-нибудь
                break;
            }
            counter++;
        }
        if (counter == 3) {
            win = true;
        }
        scanner.close();
        return win;
    }
    public static String isRightAnswer(String playerAnswer, String rightAnswer) {
        if (playerAnswer.equals(rightAnswer)) {
            return "Correct!";
        } else if (rightAnswer.equals("yes")) {
            return "'no' is wrong answer ;(. Correct answer was 'yes'";
        } else {
            return "'yes' is wrong answer ;(. Correct answer was 'no'";
        }
    }
    public static int getRandomNumber() {
        return (int) (Math.random() * 100000) + 1; // может поменять диапазон
    }
    public static String isEven(int number) {
        if (number % 2 == 0) {
            return "yes";
        }
        return "no";
    }
}
