package Q1;

// Q.1.2 Create a class called Product that includes distinct methods for obtaining the total products sold, 
// calculating the average products sold, and determining the most popular product. 
// The Product class must implement an IProducts interface that contains the following:
public interface IProducts {
    int GetTotalProductsSold();
    double GetAverageProductSold();
    String GetMostPopularProduct();
}
