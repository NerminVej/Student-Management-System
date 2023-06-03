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

}

