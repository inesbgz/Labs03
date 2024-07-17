import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderObserver> observers = new ArrayList<>();
    private double totalPrice;
    private int itemCount;
    private double shippingCost;

    public Order() {
        this.shippingCost = 10.0; // Default shipping cost
    }

    public void attach(OrderObserver observer) {
        observers.add(observer);
    }

    public void detach(OrderObserver observer) {
        observers.remove(observer);
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void addItem(double price, int quantity) {
        itemCount += quantity;
        totalPrice += price * quantity;
        notifyObservers();
    }

    public int getItemCount() {
        return itemCount;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    private void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(this);
        }
    }

    public String toString() {
        return "Order{" +
                "totalPrice=" + totalPrice +
                ", itemCount=" + itemCount +
                ", shippingCost=" + shippingCost +
                '}';
    }
}
