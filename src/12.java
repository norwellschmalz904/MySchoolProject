import java.util.Random;

public class MyClass {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(10);
        System.out.println(num);
    }
}
