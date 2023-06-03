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

}
