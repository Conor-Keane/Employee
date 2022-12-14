package ie.atu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTestSuccess {

    private Employee myEmployee;

    @BeforeEach
    void setUp() {
        myEmployee = new Employee("Conor", "1234567891011", "Full-time", "Male", 21); {

        }
    }

    @Test
    void testNameSuccess() {
        assertEquals("Conor", myEmployee.getName());
    }

    @Test
    void testPpsIdSuccess() {assertEquals("1234567891011", myEmployee.getPpsId());}

    @Test
    void testEmploymentType() { assertEquals("Full-time", myEmployee.getEmploymentType());}

    @Test
    void testGenderType() { assertEquals("Male", myEmployee.getGender()); }

    @Test
    void testAge() { assertEquals(21, myEmployee.getAge());}

}