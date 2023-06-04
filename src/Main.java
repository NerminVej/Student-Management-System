import java.util.ArrayList;
import java.util.Scanner;

// The main class handles the CLI portion of the project.
public class Main {
    public static void main(String[] args) {

        // The scanner we use to get the input of the user.
        Scanner scanner = new Scanner(System.in);

        // Creating objects for both managers.
        StudentManager studentManager = new StudentManager();
        CourseManager courseManager = new CourseManager();

        // We set up a while loop so that we can make sure that we get the right input and that the process
        // does not get interrupted.
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("----- Student Management System Menu -----");
            System.out.println("1. Add Student");
            System.out.println("2. View Course");
            System.out.println("3. Assign Grade");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            // We then store the choice of the user inside a variable called "choice".
            int choice = scanner.nextInt();
            // Consume the new line character
            scanner.nextLine();

            // We use switch case to call different methods depending on the needs of the user.
            // This can be further expanded upon.
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

    // This method is responsible for adding a student to the student manager.
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


    // This method asks to enter a student ID and a course name to then input a grade for that course for that student.
    // We make multiple input validation checks to see if the student is inside the course and a legitimate student.
    private static void assignGrade(Scanner scanner, StudentManager studentManager, CourseManager courseManager) {
        System.out.println("Assign Grade");
        // Prompt for student ID, course code, and grade
        System.out.println("Enter the student ID: ");
        int studentID = scanner.nextInt();
        scanner.nextLine();

        // We want to check if the student is actually inside the studentManager studentList.
        if (studentManager.containsStudent(studentID)){
            System.out.println("Enter the course name: ");
            String courseName = scanner.nextLine();
            // We check if the course is inside the list of courses.
            if (courseManager.containsCourse(courseName)){
                System.out.println("Enter the grade: ");
                int grade = scanner.nextInt();
                scanner.nextLine();
                Student student = studentManager.getStudentById(studentID);
                // We set the grade of the student inside the course to the grade the user inputs.
                student.set_grade(courseName, grade);
            }
            else {
                System.out.println("Invalid course name.");
            }

        }
        else {
            System.out.println("Invalid student ID.");
        }

    }
}