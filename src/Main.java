import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // An ArrayList is a dynamic data structure. So we use that to store our students.
        ArrayList<Student> studentList = new ArrayList<>();




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
