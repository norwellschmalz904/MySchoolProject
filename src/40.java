public class SimpleSchool {
    private static final int MAX_STUDENTS = 10;

    public void enrollStudent() {
        // Add code to add students to the school roster
        System.out.println("A new student has been added.");
    }

    public void removeStudent(int studentId) {
        // Add code to remove a student from the school roster
        if (studentId < MAX_STUDENTS) {
            System.out.println("Student with ID " + studentId + " has been removed.");
        } else {
            System.out.println("The student with ID " + studentId + " does not exist in the roster.");
        }
    }

    public void printStudents() {
        // Add code to display all students in the school roster
        for (int i = 0; i < MAX_STUDENTS; i++) {
            System.out.println("Student " + i + ": ID " + (i + 1));
        }
    }

    public static void main(String[] args) {
        SimpleSchool mySchool = new SimpleSchool();
        System.out.println(mySchool.printStudents());
        mySchool.enrollStudent();
        mySchool.removeStudent(4);
        mySchool.printStudents();
    }
}
