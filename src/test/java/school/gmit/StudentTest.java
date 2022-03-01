package school.gmit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;




public class StudentTest {
    Student student1 = new Student();
    Student student2 = new Student();
    Student student3 = new Student();

    @Test
    @BeforeEach
    void initStudent(){
        student1.setStudentName("Chris Barry");
        student1.setStudentEmail("cbarry@gmit.ie");

        student2.setStudentName("Murray Scott");
        student2.setStudentEmail("mscott@gmit.ie");
    }

    @Test
    public void testInitializedStudentNameAndEmail(){
        Assertions.assertNotNull(student1.getStudentName());
        Assertions.assertNotNull(student2.getStudentName());

        Assertions.assertNotNull(student1.getStudentEmail());
        Assertions.assertNotNull(student2.getStudentEmail());
    }

    @Test
    public void testStudentNameWithNumbers(){
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () ->{
            student3.setStudentName("John1");
        });

        Assertions.assertEquals("Numbers exist in name...", exception.getMessage());
    }
}
