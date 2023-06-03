
# Project Idea: Student Management System

The Student Management System is a Java-based application that allows administrators to manage student records, courses, and grades. It provides functionalities for adding, updating, and deleting student and course information. Additionally, administrators can assign grades to students and generate reports based on student performance.

# 1. Student Management:

## Add Student: Allow administrators to add new student records to the system. Collect relevant details such as name, student ID, contact information, and enrollment status.

````Java
public class StudentManager {  
  
    // An ArrayList is a dynamic data structure. So we use that to store our students.  
    private ArrayList<Student> studentList;  
  
    public StudentManager(){  
        studentList = new ArrayList<>();  
  
    }  
  
    public void addStudent(Student student){  
        studentList.add(student);  
    }
`````

We have created a StudentManger class that stores all the students inside of it. Sort of like a library. We use an ArrayList since its a dynamic data structure.
With the method "addStudent" we are able to add a new student inside of our System.

## View Student: Provide a feature to view existing student records, displaying all relevant information.

````Java
public void studentPrinter(){  
    System.out.println("Student ID: " + studentID);  
    System.out.println("Contact Information: " + contactInformation);  
    System.out.println("Enrollment Status: " + enrollmentStatus);  
}
`````

I have created a "Student" class which contains all the information about a student. Inside of the class there is a "studentPrinter" method that prints all the information to the console.

## Update Student: Enable administrators to update student information, such as contact details or enrollment status.

````Java
public class Student {  
    // All the information every student should have.  
    private int studentID;  
    private int contactInformation;  
    private String enrollmentStatus;  
  
  
    public Student(int studentID, int contactInformation,  
                   String enrollmentStatus){  
        this.studentID = studentID;  
        this.contactInformation = contactInformation;  
        this.enrollmentStatus = enrollmentStatus;  
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
`````

Set up getters and setters for all the information a student should have.

## Delete Student: Allow administrators to remove student records from the system, ensuring the deletion is performed securely.

````Java
public void deleteStudent(int studentIDToRemove){  
    for(int i = 0; i < studentList.size(); i++){  
        // We are using the variable "student" to check if the id matches with our students ID.  
        // We can retrieve the "Student" object at each index        Student student = studentList.get(i);  
  
        if (student.get_studentID() == studentIDToRemove){  
            studentList.remove(i);  
            System.out.println("Student with the ID " + studentIDToRemove + " got removed");  
            // Exit the loop if we found the student.  
            return;  
        }  
    }  
    System.out.println("Student with ID " + studentIDToRemove + " was not found");  
}
`````

Deletion is done inside of the "StudentManager" class. We insert into the method the student ID that we want to remove. We then loop through all of our students inside of our ArrayList and if the ID that we want to remove matches with one student, then we want to remove the student.

