
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

# 2. Course Management:

## Add Course: Provide functionality to add new courses to the system. Collect information such as course name, code, and credit hours.

````Java
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
`````

````Java
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
`````

We created a "Course" class that has all the information a course should have. And we created the "CourseManager" class that stores all the courses inside of an ArrayList.

````Java
public void addCourse(Course course){  
    courseList.add(course);  
}
`````

Inside of that class we have created the "addCourse" methods that adds a course to the ArrayList "courseList".

## View Course: Allow administrators to view all available courses, displaying their details.

````Java
public void viewCourse(){  
    // foreach loop to go through all the courses  
    for (Course course : courseList){  
        System.out.println("Course name: " + course.get_courseName()  
                + " Course Code " + course.get_code() +  
                " Course Credit Hours " + course.get_creditHours());  
  
  
    }  
}
`````

With the help of a foreach loop we go through every single course and print all the information of it.

## Update Course: Enable administrators to update course information, such as course name or credit hours.

````Java
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
`````

This is done by using getters and setters inside of the "Course" class. With these methods we are able to get and set variables.

## Delete Course: Allow administrators to delete courses from the system, ensuring the deletion is performed securely.


````Java
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
`````

Very similar code to the delete method inside of our "StudentManger" class. This time I used a foreach loop to iterate through the ArrayList.

