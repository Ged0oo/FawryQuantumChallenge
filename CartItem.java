
public class CartItem {
    private Item item;
    private int quantity;

    public CartItem(Item item, int quantity) {
        if (item == null)
            throw new IllegalArgumentException("Item cannot be null");
        if (quantity <= 0)
            throw new IllegalArgumentException("Quantity must be positive");

        this.item = item;
        this.quantity = quantity;
    }

    public Item getItem() { return item; }
    public int getQuantity() { return quantity; }
    public int getTotalPrice() { return item.getPrice() * quantity; }
    public int getTotalWeight() { return item.getWeight() * quantity; }
}
