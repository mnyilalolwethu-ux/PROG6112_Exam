package Q2;

public class ProductCalculations implements IProductCalculations {
    private double price;

    public ProductCalculations(double price) {
        this.price = price;
    }

    public double GetVat() {
        return price * 0.15; // VAT: 15% of the product price
    }

    public double GetCommission() {
        return price * 0.05; // Commission: 5% of the product price
    }

    public double GetTotal() {
        return price + GetVat() + GetCommission(); // Total Sale Amount: Price + VAT + Commission
    }
}
