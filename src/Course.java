import java.util.ArrayList;

public class Course {
    // This class is responsible for creating Course objects
    private String courseName;
    private String code;
    private int creditHours;

    // We create an ArrayList that contains all the student names that enroll in a course.
    private ArrayList<Student> studentsInCourse;

    public Course(String courseName, String code, int creditHours){
        this.courseName = courseName;
        this.code = code;
        this.creditHours = creditHours;
        studentsInCourse = new ArrayList<>();

    }


    // Getters and setters for the Course class.
    public String get_courseName(){
        return courseName;
    }
    public void set_courseName(String newCourseName){
        courseName = newCourseName;
    }
    public String get_code(){
        return code;
    }
    public void set_code(String newCode){
        code = newCode;
    }

    public int get_creditHours(){
        return creditHours;
    }
    public void set_CreditHours(int newCreditHours){
        creditHours = newCreditHours;
    }

    // This method returns the amount of students enrolled inside of one course.
    public int getEnrolledStudents(){
        return studentsInCourse.size();
    }

    // This method adds a student to the course
    public void addStudentToCourse(Student student){
        // additional validation to check if the student is already inside of the course.
        if (studentsInCourse.contains(student)){
            System.out.println("Student is already inside of the course");
            // Exit the method if the student is already inside of the course
            return;
        }
        // Otherwise add the student to the course.
        else{
            studentsInCourse.add(student);
        }
    }

    // A method that loops through all the students inside a course.
    public void viewEnrollment(){
        // Foreach loop through all the students in the ArrayList

        for (Student student : studentsInCourse){
            System.out.println("The students that are inside of the course " + courseName + " are:");
            System.out.println("Student ID " + student.get_studentID()
                    + ", Contact Information: " + student.get_contactInformation() +
                    ", Enrollment Status: " + student.get_enrollmentStatus());


        }
        System.out.println("Total amount of students enrolled in this course is: " + getEnrolledStudents());
    }

}
