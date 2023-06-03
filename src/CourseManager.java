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

}

