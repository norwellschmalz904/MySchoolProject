public class SchoolProject {
    public static void main(String[] args) {
        // Example: Print "Hello, World!"
        System.out.println("Hello, World!");

        // Example: Read user input and display it to the console
        String userInput = readUserInput();
        System.out.println("You entered: " + userInput);

        // Example: Calculate factorial of a number (5!)
        int num = 5;
        long result = calculateFactorial(num);
        System.out.println("The factorial of " + num + " is: " + result);
    }

    private static String readUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your input here: ");
        return scanner.nextLine();
    }

    private static long calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            long factorial = 1;
            for (int i = 2; i <= number; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }
}
