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

}