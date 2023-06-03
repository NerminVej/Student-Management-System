import java.util.HashMap;
import java.util.Map;

public class Student {
    // All the information every student should have.
    private int studentID;
    private int contactInformation;
    private String enrollmentStatus;
    // A new variable that stores the grade of each student
    // We use a Hashmap so we can put multiple grades with their respected courses inside of it.
    private HashMap<String, Integer> gradesOfCourses;


    public Student(int studentID, int contactInformation,
                   String enrollmentStatus, int grade){
        this.studentID = studentID;
        this.contactInformation = contactInformation;
        this.enrollmentStatus = enrollmentStatus;
        gradesOfCourses = new HashMap<>();

    }

    // To get and set the studentID.
    public void set_studentID(int newStudentID){
        studentID = newStudentID;
    }
    public int get_studentID(){
        return studentID;
    }

    // To get and set the Contact Information.
    public void set_contactInformation(int newContactInformation){
        contactInformation = newContactInformation;
    }
    public int get_contactInformation(){
        return contactInformation;
    }

    // To get and set the enrollment status.
    public void set_enrollmentStatus(String newEnrollmentStatus){
        enrollmentStatus = newEnrollmentStatus;
    }
    public String get_enrollmentStatus(){
        return enrollmentStatus;
    }


    public void set_grade(String courseName, int courseGrade){
        // I made a grading system that goes from 0 to 15 (German A-levels system)
        if (courseGrade >= 0 && courseGrade <= 15){
            // We put the new grade with the name of the course inside the hashmap
            gradesOfCourses.put(courseName, courseGrade);
        }
        else {
            System.out.println("Invalid grade, Grade should be between 0 and 15.");
        }
    }
    // We retrieve the grade of the course with .get.
    public int get_grade(String courseName){
        return gradesOfCourses.get(courseName);
    }
    // A method to print out the credentials of a student.
    public void studentPrinter(){
        System.out.println("Student ID: " + studentID);
        System.out.println("Contact Information: " + contactInformation);
        System.out.println("Enrollment Status: " + enrollmentStatus);
    }
}
