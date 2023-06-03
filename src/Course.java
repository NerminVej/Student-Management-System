public class Course {
    // This class is responsible for creating Course objects
    private String courseName;
    private String code;
    private int creditHours;

    public Course(String courseName, String code, int creditHours){
        this.courseName = courseName;
        this.code = code;
        this.creditHours = creditHours;

    }


    public String get_courseName(){
        return courseName;
    }
    public String get_code(){
        return code;
    }
    public int get_creditHours(){
        return creditHours;
    }

}
