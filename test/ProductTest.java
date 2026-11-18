// Q.1.4 You are also required to write unit tests for the application. Create a test package within the application you created, 
// which will contain the necessary unit tests. You are required to write unit tests verifying that GetTotalProductSales and GetAverageProductSold return correct values.
import QUESTION1.Product;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProductTest {

    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
        String[] products = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        int[][] sales = {
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
        }; 
        
        Product product = new Product(products, sales);
        assertEquals(153, product.GetTotalProductsSold());
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        String[] products = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        int[][] sales = {
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
        };
        
        Product product = new Product(products, sales);
        assertEquals(17.0, product.GetAverageProductSold(), 0.001);
    }
}
