package hexlet.code;

public class Utility {

    public static int getRandomNumber(int minNumber, int maxNumber) {
        return (int) (Math.random() * (maxNumber - minNumber)) + minNumber;
    }

}


