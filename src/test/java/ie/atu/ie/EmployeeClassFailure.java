package ie.atu.ie;

import ie.atu.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeClassFailure {
    private Employee myEmployee;

    @BeforeEach
    void setUp() { myEmployee = new Employee("Conor", "1234567891011", "Full-time", "Male", 21);}

    @Test
    void testNameFail() {
        Exception exMessage = assertThrows(IllegalArgumentException.class() -> new Employee("ag", "1234567891011", "Full-time", "Mle", 21););
        assertEquals("Name must be of 3 characters, maximum 25 characters", exMessage.getMessage());
    }
    @Test
    void testAgeFail() {
        Exception exMessage = assertThrows(IllegalArgumentException.class() -> new Employee("Conor", "1234567891011", "Full-time", "Mle", 15););
        assertEquals("Must be over 16 and under 66", exMessage.getMessage());
    }




}
