import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MainTest {

    private StudentManager studentManager;

    @BeforeEach
    public void setUp() {
        studentManager = new StudentManager();
    }

    @Test
    public void testAddStudent() {
        // Create a student
        Student student = new Student(1, 123, "Enrolled");

        // Add the student to the manager
        studentManager.addStudent(student);

        // Verify that the student is added successfully
        Assertions.assertEquals(1, studentManager.getStudentList().size());
        Assertions.assertTrue(studentManager.containsStudent(1));
    }

    @Test
    public void testDeleteStudent() {
        // Create and add a student
        Student student = new Student(1, 123, "Enrolled");
        studentManager.addStudent(student);

        // Delete the student
        studentManager.deleteStudent(1);

        // Verify that the student is deleted successfully
        Assertions.assertEquals(0, studentManager.getStudentList().size());
        Assertions.assertFalse(studentManager.containsStudent(1));
    }
}
