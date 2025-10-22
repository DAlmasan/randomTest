package university;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {

    Student student = new Student("Mark Smith", 23, 2,"Duke University");

    @Test
    public void getStudentName() {
        assertEquals("Mark Smith", student.getName());
    }

    @Test
    public void getStudentAge() {
        assertEquals(23, student.getAge());
    }

    @Test
    public void getYearOfStudy() {
        assertEquals(4, student.getYearOfStudy());
    }

    @Test
    public void getCollegeName() {
        assertEquals("Dukes University", student.getCollegeName());
    }

    @Test
    public void checkAgeAfterThreeYears() {
        assertEquals(26, student.getAge() + 3);
    }

    @Test
    @Ignore
    public void getCollegeName2() {
        assertEquals("Dukes University", student.getCollegeName());
    }

    @Test
    @Ignore
    public void getCollegeName3() {
        assertEquals("Dukes University", student.getCollegeName());
    }


}