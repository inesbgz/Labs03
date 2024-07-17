import java.util.ArrayList;
import java.util.List;


public class Order {
    private List<OrderObserver> observers;
    private double totalPrice;
    private int itemCount;
    private double shippingCost;

    public void attach(OrderObserver observer) {}
    public void detach(OrderObserver observer) {}
    public double getTotalPrice() { return 0; }
    public int getItemCount() { return 0; }
    public String toString() { return ""; }

}
