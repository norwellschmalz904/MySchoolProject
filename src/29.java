public class SimpleCodeExample {
    public static void main(String[] args) {
        // Sample code to demonstrate Java's control structures and basic functions.
        int sum = 0;
        while (true) {
            System.out.println("Please enter a number: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                double num1 = Double.parseDouble(input);
                double num2 = Double.parseDouble(args[1]);
                sum += num1 + num2;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter numeric values only.");
            }
        }
        System.out.println("The sum of " + args[1] + " and the sum is: " + sum);
    }

    // Example scanner class for user input.
    private static class ScannerHandler implements Scanner {
        public void scan(String[] args) {
            String line;
            while ((line = args[0]) != null) {
                System.out.println("Please enter a number: ");
                try {
                    if (line.isEmpty()) {
                        return;
                    }
                    double inputDouble = Double.parseDouble(line);
                    args[1] = String.valueOf(inputDouble);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter numeric values only.");
                }
            }
        }

        public void scanFile(String filePath) throws Exception {
            Scanner scanner = new Scanner(new File(filePath));
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                args[0] = line;
                if (!line.isEmpty() && !line.equals("")) {
                    try {
                        double inputDouble = Double.parseDouble(line);
                        args[1] = String.valueOf(inputDouble);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter numeric values only.");
                    }
                }
            }
        }
    }

    // Example main function for user input.
    public static void main(String[] args) {
        ScannerHandler scanner = new ScannerHandler();
        scanner.scan(args);
    }
}
