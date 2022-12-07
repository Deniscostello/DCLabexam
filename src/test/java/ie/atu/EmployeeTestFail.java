package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTestFail {

    @BeforeEach
    void setUp() {
    }
    @Test
     void testNameFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> new Employee("Den", "123456"));
        assertEquals("Name provided is not valid", exMessage.getMessage());
    }

    @Test
    void testPpsidFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> new Employee("Denis", "12345"));
        assertEquals("Employee PPS should be 6 characters", exMessage.getMessage());
    }

    @AfterEach
    void tearDown() {
    }
}