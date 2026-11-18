package Q1;

// Q.1.1 Develop a Java application to generate a sales report for a local company specialising in mattress sales. 
// The report should summarise the total sales for the company's three top-performing products over three months. 
// The application must calculate and display the following: 
// - The total number of products sold 
// - The average number of products sold per product 
// - The most popular product based on the highest total sales
public class Product implements IProducts {
    private String[] productNames;
    private int[][] monthlySales;

    public Product(String[] productNames, int[][] monthlySales) {
        this.productNames = productNames;
        this.monthlySales = monthlySales;
    }

    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < monthlySales.length; i++) {
            for (int j = 0; j < monthlySales[i].length; j++) {
                total += monthlySales[i][j];
            }
        }
        return total;
    }

    public double GetAverageProductSold() {
        int total = GetTotalProductsSold();
        int count = 0;
        for (int i = 0; i < monthlySales.length; i++) {
            count += monthlySales[i].length;
        }
        return (count == 0) ? 0.0 : (double) total / count;
    }

    public String GetMostPopularProduct() {
        int maxSales = -1;
        String popularProduct = "";

        for (int i = 0; i < productNames.length; i++) {
            int productTotal = 0;
            for (int j = 0; j < monthlySales[i].length; j++) {
                productTotal += monthlySales[i][j];
            }
            if (productTotal > maxSales) {
                maxSales = productTotal;
                popularProduct = productNames[i] + " (" + maxSales + ")";
            }
        }
        return popularProduct;
    }
}
