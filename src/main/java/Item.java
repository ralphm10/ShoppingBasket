public class Item {
    private final double price;
    private int quantity;

    public Item(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    double getSubTotal() {
        return price * quantity;
    }
}
