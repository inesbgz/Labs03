public class PriceObserver implements OrderObserver {
    public void update(Order order) {
        if (order.getTotalPrice() > 200) {
            double discount = 20;
            order.addItem(-discount, 0); // Subtract discount
            System.out.println("PriceObserver applied a discount of $20. New total price: " + order.getTotalPrice());
        }
    }
}