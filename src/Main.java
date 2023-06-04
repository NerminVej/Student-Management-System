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

    // A method to just display all the courses available inside the console.
    private static void viewCourse(Scanner scanner, CourseManager courseManager) {
        System.out.println("View Course");
        // We use the viewCourse method in our courseManager class to view all the courses.
        courseManager.viewCourse();
    }

    private static void assignGrade(Scanner scanner, StudentManager studentManager, CourseManager courseManager) {
        System.out.println("Assign Grade");
        // Prompt for student ID, course code, and grade
        System.out.println("Enter the student ID: ");
        int studentID = scanner.nextInt();
        scanner.nextLine();

        // We want to check if the student is actually inside the studentManager studentList.
        if (studentManager.containsStudent(studentID)){
            System.out.println("Enter the course code: ");
            String courseCode = scanner.nextLine();

            System.out.println("Enter the grade: ");
            int grade = scanner.nextInt();
            scanner.nextLine();
        }
        else {
            return;
        }



        // Call studentManager.assignGrade(studentID, courseCode, grade) to assign the grade to the student
    }
}