package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTestSuccess<assertEquals> {

    @BeforeEach
    void setUp() {
        Employee myEmployee;
    }

    @Test
     void testNameSuccess(){
        Employee myEmployee = new Employee("Denis", "123456");
        assertEquals("Denis", myEmployee.getName());
    }

    @Test
    void testPpsidSuccess(){
        Employee myEmployee = new Employee("Cathal", "654321");
        assertEquals("654321", myEmployee.getPpsid());
    }




    @AfterEach
    void tearDown() {
    }


}