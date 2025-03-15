import java.util.Random;
public class RandomNumber {
    public static void main(String[] args) {
        System.out.println("A random number between 1 and 10 is: " + getRandomNumber());
    }
    private static int getRandomNumber() {
        return new Random().nextInt(10) + 1;
    }
}