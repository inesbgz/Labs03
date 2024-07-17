import java.util.ArrayList;
import java.util.List;

public class Card {
    private List<Product> products = new ArrayList<>();
    private User user;
    private double totalPrice;
    private double shippingCost;

    public Card(User user) {
        this.user = user;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public double calculateTotalPrice() {
        totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice() * product.getQuantity();
        }
        return totalPrice;
    }

    public double calculateShippingCost() {
        if (products.size() > 5) {
            shippingCost = 0;
        } else {
            shippingCost = 10;
        }
        return shippingCost;
    }

    public void checkout() {
        totalPrice = calculateTotalPrice();
        shippingCost = calculateShippingCost();
        System.out.println("Total price: " + totalPrice);
        System.out.println("Shipping cost: " + shippingCost);
    }
}
