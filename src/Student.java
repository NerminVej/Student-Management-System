import java.util.HashMap;
import java.util.Map;

// This class is responsible for creating student objects.
// Each student has different attributes such as an ID or gpa.
public class Student {
    // All the information every student should have.
    private int studentID;
    private int contactInformation;
    private String enrollmentStatus;
    // A new variable that stores the grade of each student
    // We use a Hashmap so we can put multiple grades with their respected courses inside of it.
    private HashMap<String, Integer> gradesOfCourses;
    // A new variable to calculate the GPA of a student.
    private double gpa;


    public Student(int studentID, int contactInformation,
                   String enrollmentStatus, int grade, double gpa){
        this.studentID = studentID;
        this.contactInformation = contactInformation;
        this.enrollmentStatus = enrollmentStatus;
        gradesOfCourses = new HashMap<>();
        this.gpa = gpa;

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
    // A method to print out all the grades of a student.
    public void printGrades(){
        // We make a for-each loop that goes over each individual entry.
        for (Map.Entry<String, Integer> entry: gradesOfCourses.entrySet()){
            // From each entry we get the key and the value in 2 different variables.
            String courseName = entry.getKey();
            Integer grade = entry.getValue();
            System.out.println("Course name: " + courseName + " Grade: " + grade);
        }
    }
    public double get_gpa(){
        return gpa;
    }


    // This method checks if the student already has a grade for a course. If he does then we can update it.
    public void update_grade(String courseName, int newGrade){

        // We have some input validation here. So that the grade is in the appropriate  range.
        if (gradesOfCourses.containsKey(courseName) && newGrade >= 0 && newGrade <= 15){
            gradesOfCourses.put(courseName, newGrade);
            return;
        }
        else if (gradesOfCourses.containsKey(courseName) == false){
            System.out.println("The student " + studentID + " is not inside of the course " + courseName);

        }
        else if (newGrade > 15){
            System.out.println("The grade specified is bigger than 15. Adjust the Grade so it is in the range of 0-15.");
        }
        else if (newGrade > 0){
            System.out.println("The grade specified is smaller than 0. Adjust the Grade so it is in the range of 0-15.");
        }

    }


    // A method to print out the credentials of a student.
    public void studentPrinter(){
        System.out.println("Student ID: " + studentID);
        System.out.println("Contact Information: " + contactInformation);
        System.out.println("Enrollment Status: " + enrollmentStatus);
    }

    // A method to calculate the GPA of a student
    public void calculateGPA(){
        // Another variable we use to sum up all the variables
        int totalGrades = 0;
        // For each loop to go through the hashmap grades.
        for (int grades : gradesOfCourses.values()){
            totalGrades += grades;
        }
        // Divide the sum of the grades with the size of the hashmap.
        if (gradesOfCourses.size() > 0){
            // We need to turn one of the variables into a double type to get a double value at the end.
            gpa = (double) totalGrades / gradesOfCourses.size();
        }
        else {
            gpa = 0.0;
        }
    }
    // A method to create a student report. Shows the gpa and grades of the student as well as other information.
    public void createStudentReport(){
        // We just use all the different methods that we have created in this class.
        System.out.println("Student Report:");
        studentPrinter();
        calculateGPA();
        System.out.println("GPA score of the student is: " + gpa);
        printGrades();
    }
}
