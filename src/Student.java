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

    // A method to print out the credentials of a student.
    public void studentPrinter(){
        System.out.println("Student ID: " + studentID);
        System.out.println("Contact Information: " + contactInformation);
        System.out.println("Enrollment Status: " + enrollmentStatus);
    }
}
