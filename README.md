
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

# 3. Enrollment:

## Enroll Student: Implement a feature that enables administrators to enroll students in courses. Associate students with the courses they are registered for, considering appropriate validation to prevent duplicate enrollments.

````Java
private ArrayList<Student> studentsInCourse;
`````

Inside of our "Course" class we add a new ArrayList that contains "Student" objects inside of it.

````Java
// This method adds a student to the course  
public void addStudentToCourse(Student student){  
    // additional validation to check if the student is already inside of the course.  
    if (studentsInCourse.contains(student)){  
        System.out.println("Student is already inside of the course");  
        // Exit the method if the student is already inside of the course  
        return;  
    }  
    // Otherwise add the student to the course.  
    else{  
        studentsInCourse.add(student);  
    }  
}
`````

We then implement a method that enables us to add a new student to our ArrayList.

````Java
if (studentsInCourse.contains(student)){  
    System.out.println("Student is already inside of the course");  
    // Exit the method if the student is already inside of the course  
    return;  
}
`````

Important "if" validation to check whether or not the student is already inside of the course or not. If the student is already inside of the course then we just "return" and quit the method.

````Java
else{  
    studentsInCourse.add(student);  
}
`````

Else we add the student to our ArrayList.

## View Enrollment: Provide the ability to view enrolled students for each course, displaying relevant student information.

````Java
public void viewEnrollment(){  
    // Foreach loop through all the students in the ArrayList  
    for (Student student : studentsInCourse){  
        System.out.println("The students that are inside of the course " + courseName + " are:");  
        System.out.println("Student ID " + student.get_studentID()  
                + ", Contact Information: " + student.get_contactInformation() +  
                ", Enrollment Status: " + student.get_enrollmentStatus());  
  
    }  
}
`````

A foreach loop that iterates through all of the students that are inside of a course. We have done such a thing before in this project.

# 4. Grade Management:

## Assign Grades: Implement a grading system where administrators can assign grades to students for each enrolled course. Store and manage the grades associated with each student and course.

````Java
private HashMap<String, Integer> gradesOfCourses;
`````

I have added a HashMap inside of the "Student" class. With a HashMap we can store the name of the course and we can store the student ID.

````Java
public void set_grade(String courseName, int courseGrade){  
    // I made a grading system that goes from 0 to 15 (German A-levels system)  
    if (courseGrade >= 0 && courseGrade <= 15){  
        // We put the new grade with the name of the course inside the hashmap  
        gradesOfCourses.put(courseName, courseGrade);  
    }  
    else {  
        System.out.println("Invalid grade, Grade should be between 0 and 15.");  
    }  
}
`````

We then create a method called "set_grade" which is responsible for putting values inside of the "gradesOfCourses" HashMap.
We check if the grade we give "courseGrade" is inside of the valid range of grades.
I used the range 0 to 15 since these are the marks that A-level students get in Germany.

## Update Grades: Allow administrators to update previously assigned grades if necessary.

````Java
// This method checks if the student already has a grade for a course. If he does then we can update it.  
public void update_grade(String courseName, int newGrade){  
  
    // We have some input validation here. So that the grade is in the appropriate  range.  
    if (gradesOfCourses.containsKey(courseName) && newGrade >= 0 && newGrade <= 15){  
        gradesOfCourses.put(courseName, newGrade);  
        return;    }  
    else if (gradesOfCourses.containsKey(courseName) == false){  
        System.out.println("The student " + studentID + " is not inside of the course " + courseName);  
  
    }  
    else if (newGrade > 15){  
        System.out.println("The grade specified is bigger than 15. Adjust the Grade so it is in the range of 0-15.");  
    }  
    else if (newGrade > 0){  
        System.out.println("The grade specified is smaller than 0. Adjust the Grade so it is in the range of 0-15.");  
    }  
  
}
`````

Let us go through this method one by one.

````Java
if (gradesOfCourses.containsKey(courseName) && newGrade >= 0 && newGrade <= 15){  
    gradesOfCourses.put(courseName, newGrade);  
    return;}
`````

At first we have an "if" statement. This checks if the HashMap contains a key with the name of the course inside of it. And we also want the grade we give to be in range of the valid range that we specified before for our project.

````Java
else if (gradesOfCourses.containsKey(courseName) == false){  
    System.out.println("The student " + studentID + " is not inside of the course " + courseName);  
  
}  
else if (newGrade > 15){  
    System.out.println("The grade specified is bigger than 15. Adjust the Grade so it is in the range of 0-15.");  
}  
else if (newGrade > 0){  
    System.out.println("The grade specified is smaller than 0. Adjust the Grade so it is in the range of 0-15.");  
}
`````

We can have some more input validations and error handling.

## Calculate GPA: Provide a feature to calculate the Grade Point Average (GPA) for each student based on their grades.

````Java
// A new variable to calculate the GPA of a student.  
private double gpa;
`````

We create a new variable to store the students gpa. This time we use a double variable type.

````Java
// A method to calculate the GPA of a student  
public void calculateGPA(){  
    // Another variable we use to sum up all the variables  
    int totalGrades = 0;  
    // For each loop to go through the hashmap grades.  
    for (int grades : gradesOfCourses.values()){  
        totalGrades += grades;  
    }  
    // Divide the sum of the grades with the size of the hashmap.  
    if (gradesOfCourses.size() > 0){  
        // We need to turn one of the variables into a double type to get a double value at the end.  
        gpa = (double) totalGrades / gradesOfCourses.size();  
    }  
    else {  
        gpa = 0.0;  
    }  
}
`````

Again we can go line by line through the code.

````Java
int totalGrades = 0;
`````

We initialize a new variable called "totalGrades" that we set to 0. We use this variable to sum up all of the grades that a student accumulated.

````Java
for (int grades : gradesOfCourses.values()){  
    totalGrades += grades;  
}
`````

Simple For-each loop that goes through all the grades and adds them to the "totalGrades" variable.

````Java
// Divide the sum of the grades with the size of the hashmap.  
if (gradesOfCourses.size() > 0){  
    // We need to turn one of the variables into a double type to get a double value at the end.  
    gpa = (double) totalGrades / gradesOfCourses.size();  
}  
else {  
    gpa = 0.0;  
}
`````

An "if" statement to check, if the student actually has some grades. If he does not we just set the gpa to 0.0.

# 5. Reports

## Student Performance Report: Generate reports summarizing student performance. This report may include the student's overall GPA, course-wise grades, and any other relevant information.

````Java
// A method to create a student report. Shows the gpa and grades of the student as well as other information.  
public void createStudentReport(){  
    // We just use all the different methods that we have created in this class.  
    System.out.println("Student Report:");  
    studentPrinter();  
    calculateGPA();  
    System.out.println("GPA score of the student is: " + gpa);  
    printGrades();  
}
`````

Inside of this method we are creating a report of a student. We do that by using different methods that we have created in previous steps just by calling them.

The "printGrades" method is a new one though.

````Java
// A method to print out all the grades of a student.  
public void printGrades(){  
    // We make a for-each loop that goes over each individual entry.  
    for (Map.Entry<String, Integer> entry: gradesOfCourses.entrySet()){  
        // From each entry we get the key and the value in 2 different variables.  
        String courseName = entry.getKey();  
        Integer grade = entry.getValue();  
        System.out.println("Course name: " + courseName + " Grade: " + grade);  
    }  
}
`````

This method prints out all the grades of a student.

````Java
for (Map.Entry<String, Integer> entry: gradesOfCourses.entrySet()){  
    // From each entry we get the key and the value in 2 different variables.  
    String courseName = entry.getKey();  
    Integer grade = entry.getValue();  
    System.out.println("Course name: " + courseName + " Grade: " + grade);  
}
`````

We use a for-each loop to go through every entry. With "Map.Entry<String, Integer>" we are able to get every single entry with its key and its value.

````Java
String courseName = entry.getKey();  
Integer grade = entry.getValue();
`````

We set "courseName" and "grade" to the value of "entry.getKey()" and "entry.getValue()" respectively.

## Course Enrollment Report: Generate a report displaying the enrollment details for each course, including the number of students enrolled.

Inside of the "Course" class I added a method.

````Java
public int getEnrolledStudents(){  
    return studentsInCourse.size();  
}
`````

With this method we are able to gain the amount of students that are currently in a course.

With this method I can now create a new method that iterates over each course inside of the list of courses and prints out a report.

````Java
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
`````

We do it again with a for-each loop. We use getter methods that we have previously created to gain information about the specific course. At the end we use the "getEnrolledStudents()" method to gain the number of total students inside of that course.



