import java.util.*;

public class MySchoolProject {
  public static void main(String[] args) {
    // Get a random number between 1 and 10
    Random rand = new Random();
    int num = rand.nextInt(10) + 1;
    
    // Print the random number
    System.out.println("The random number is: " + num);
  }
}
