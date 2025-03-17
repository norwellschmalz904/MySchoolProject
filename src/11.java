import java.util.Scanner;
public class MySchoolProject {
	public static void main(String[] args) {
		// create a new Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);

		// prompt the user for their name
		System.out.print("Enter your name: ");

		// use the next() method of the Scanner object to read a line of text
		String name = scanner.nextLine();

		// print out a greeting message using the name
		System.out.println("Hello, " + name + "!");
	}
}
