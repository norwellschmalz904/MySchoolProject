public class SimpleSchoolProject {
    public static void main(String[] args) {
        // Example of using Java 8 features such as streams and lambda expressions

        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + s2;

        System.out.println(s3);

        double a = 5.5;
        double b = 2.0;
        double c = (a / b);
        System.out.println(c);

        // Example of using lambda expressions to find the maximum value
        int[] numbers = {1, 2, 3, 4, 5};
        int max = Arrays.stream(numbers).max().getAsInt();
        System.out.println(max);

        // Example of using if-else statements for a simple conditional statement
        int num = 7;
        if (num > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }
    }
}
