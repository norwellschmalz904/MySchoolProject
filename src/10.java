import java.util.Scanner;
public class MySchoolProject {
public static void main(String[] args) {
int[] marks = new int[5];
marks[0] = 89;
marks[1] = 76;
marks[2] = 92;
marks[3] = 88;
marks[4] = 90;
int sum = 0;
for (int i = 0; i < marks.length; i++) {
sum += marks[i];
}
System.out.println("The average mark is: " + sum / marks.length);
}
}