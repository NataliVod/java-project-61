package hexlet.code;

public class Utility {

    public static int getRandomNumber(int minNumber, int maxNumber) {
        return (int) (Math.random() * (maxNumber - minNumber)) + minNumber;
    }

    public static String[][] generateEmptyArray() {
        return new String[Engine.MAX_ROUNDS][2];
    }
}


