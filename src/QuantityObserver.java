public class QuantityObserver implements OrderObserver {
    public void update(Order order) {
        if (order.getItemCount() > 5) {
            order.setShippingCost(0);
            System.out.println("QuantityObserver set the shipping cost to $0.");
        } else {
            order.setShippingCost(10);
            System.out.println("QuantityObserver set the shipping cost to $10.");
        }
    }
}
