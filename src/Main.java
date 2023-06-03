import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        CourseManager courseManager = new CourseManager();

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("----- Student Management System Menu -----");
            System.out.println("1. Add Student");
            System.out.println("2. View Course");
            System.out.println("3. Assign Grade");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            // Consume the new line character
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addStudent(scanner, studentManager);
                    break;
                case 2:
                    viewCourse(scanner, courseManager);
                    break;
                case 3:
                    assignGrade(scanner, studentManager, courseManager);
                    break;
                case 0:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        // Clean up resources
        scanner.close();
    }

    private static void addStudent(Scanner scanner, StudentManager studentManager) {
        System.out.println("Add Student");
        // We prompt the user to enter the student credentials

        System.out.println("Enter student ID: ");
        int studentID = scanner.nextInt();



        System.out.println("Enter the student contact information here: ");
        int contactInformation = scanner.nextInt();

        // Consume the remaining newline character.
        scanner.nextLine();

        System.out.println("Enter enrollment Status here: ");
        String enrollmentStatus = scanner.nextLine();;

        Student student = new Student(studentID, contactInformation, enrollmentStatus);
        // We add the new student to the studentManager object.

        studentManager.addStudent(student);
    }

    private static void viewCourse(Scanner scanner, CourseManager courseManager) {
        System.out.println("View Course");
        // Prompt for course details or display a list of available courses
        // Call courseManager.viewCourse(course) to retrieve and display course information
    }

    private static void assignGrade(Scanner scanner, StudentManager studentManager, CourseManager courseManager) {
        System.out.println("Assign Grade");
        // Prompt for student ID, course code, and grade
        // Call studentManager.assignGrade(studentID, courseCode, grade) to assign the grade to the student
    }
}