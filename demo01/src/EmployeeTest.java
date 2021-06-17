import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    @DisplayName("Default Constructor of Employee return '?:?' ")
    public void ConstructorDefaultTest() {
        String expectedResult = "? : ?";
        Employee demo = new Employee();
        String actualResult = demo.getFullName();
        //Assert
        assertEquals(expectedResult,actualResult);
    }

    @Test
    @DisplayName("Constructor with fname & lname, getFullName return 'fname:lname' ")
    public void ConstructorWithNameTest() {
        String expectedResult = "Worapat : Tubtimdee";
        Employee demo = new Employee("Worapat","Tubtimdee");
        String actualResult = demo.getFullName();
        //Assert
        assertEquals(expectedResult,actualResult);
    }
}