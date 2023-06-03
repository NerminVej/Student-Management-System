import java.util.ArrayList;

public class StudentManager {

    // An ArrayList is a dynamic data structure. So we use that to store our students.
    private ArrayList<Student> studentList;

    public StudentManager(){
        studentList = new ArrayList<>();

    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    // This method searches through our ArrayList for the student we want to delete.
    public void deleteStudent(int studentIDToRemove){
        for(int i = 0; i < studentList.size(); i++){
            // We are using the variable "student" to check if the id matches with our students ID.
            // We can retrieve the "Student" object at each index
            Student student = studentList.get(i);

            if (student.get_studentID() == studentIDToRemove){
                studentList.remove(i);
                System.out.println("Student with the ID " + studentIDToRemove + " got removed");
                // Exit the loop if we found the student.
                return;
            }
        }
        System.out.println("Student with ID " + studentIDToRemove + " was not found");
    }
}
