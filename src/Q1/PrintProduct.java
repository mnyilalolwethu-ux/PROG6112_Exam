package Q1;

// Q.1.3 Additionally, create a class named PrintProduct that is responsible for printing the necessary data for the report. 
// This class should include methods to print the total product sales, print the average product sales, and print the most popular product sales.
public class PrintProduct {
    private IProducts productReport;

    public PrintProduct(IProducts productReport) {
        this.productReport = productReport;
    }

    public void printReport() {
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("*************************************************");
        System.out.println("TOTAL PRODUCT SALES: " + productReport.GetTotalProductsSold());
        System.out.println("AVERAGE PRODUCT SALES: " + Math.round(productReport.GetAverageProductSold()));
        System.out.println("MOST POPULAR PRODUCT: " + productReport.GetMostPopularProduct());
        System.out.println("*************************************************");
    }
}
