// Q.2.6 You are required to write unit tests for the application. Create a test package within the application you created, 
// including Unit Test 1 (GetVat_WithValidData_ReturnsCorrectValue) and Unit Test 2 (GetTotal_WithValidData_ReturnsCorrectValue).
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProductCalculationsTest {

    @Test
    public void GetVat_WithValidData_ReturnsCorrectValue() {
        ProductCalculations calc = new ProductCalculations(3500.0);
        assertEquals(525.0, calc.GetVat(), 0.001);
    }

    @Test
    public void GetTotal_WithValidData_ReturnsCorrectValue() {
        ProductCalculations calc = new ProductCalculations(3500.0);
        assertEquals(4200.0, calc.GetTotal(), 0.001);
    }
}
