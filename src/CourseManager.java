import java.util.ArrayList;


public class CourseManager {
    // This class is responsible for handling the different courses
    private ArrayList<Course> courseList;

    public CourseManager(){
        courseList = new ArrayList<>();

    }

    // This method adds a course to the courseList ArrayList
    public void addCourse(Course course){
        courseList.add(course);
    }

    // This method is responsible for displaying all course details
    public void viewCourse(){
        // foreach loop to go through all the courses
        for (Course course : courseList){
            System.out.println("Course name: " + course.get_courseName()
                    + " Course Code " + course.get_code() +
                    " Course Credit Hours " + course.get_creditHours());


        }
    }

    // A method that returns the total number of students enrolled in all courses.
    public int get_TotalEnrolledStudents(){
        int totalStudents = 0;
        for (Course course : courseList){
            totalStudents += course.getEnrolledStudents();
        }
        return totalStudents;
    }

    // This method handles the deletion of a course
    public void deleteCourse(String courseNameToDelete){
        // Foreach loop through the ArrayList to find the "Course" with the matching name.
        for (Course course : courseList){
            // We check if the course name is the same as the one we want to delete.
            if (course.get_courseName().equals(courseNameToDelete)){
                courseList.remove(course);
                System.out.println("The course " + course.get_courseName() + " got deleted successfully!");
                // To exit out of the loop.
                return;
            }

        }
        // If nothing was found we print a message.
        System.out.println("Could not find a course with a matching name");

    }
    // This method iterates over each course inside the courseList ArrayList.
    public void createCourseEnrollmentReport(){
        for (Course course : courseList){
            // We call the viewEnrollment method to create a list of all students enrolled in a course.
            course.viewEnrollment();
            System.out.println("Course: " + course.get_courseName());
            System.out.println("Course Code: " + course.get_code());
            System.out.println("Credit Hours:" + course.get_creditHours());
            System.out.println("Number of Students Enrolled: " + course.getEnrolledStudents());
        }
    }

    // This method checks if a course is inside the list of courses with the course name.
    public boolean containsCourse(String courseName){
        for (Course course : courseList){
            if (course.get_courseName().equals(courseName)){
                return true;
            }
        }
        return false;
    }

}

