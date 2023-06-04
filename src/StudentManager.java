import java.util.ArrayList;
import java.util.List;

// This class handles the storing of students inside an ArrayList.
public class StudentManager {

    // An ArrayList is a dynamic data structure. So we use that to store our students.
    private ArrayList<Student> studentList;

    public StudentManager(){
        studentList = new ArrayList<>();

    }

    // This method checks if a student with the given ID exists in the studentList ArrayList.
    public boolean containsStudent(int studentID){
        for (Student student : studentList){
            if (student.get_studentID() == studentID){
                return true;
            }
        }
        return false;
    }

    // This method gets a student by ID.
    public Student getStudentById(int studentID){
        for (Student student : studentList){
            if (student.get_studentID() == studentID){
                return student;
            }
        }
        // If student was not found just return null.
        return null;
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

    public List<Student> getStudentList(){
        return studentList;
    }

}
