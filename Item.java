
public class Item {
    private String name;
    private int price; 
    private int weight;

    public Item(String name, int price, int weight) {
        if (name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("Item name cannot be null or empty");
			
        if (price < 0 || weight < 0)
            throw new IllegalArgumentException("Price and weight must be non-negative");

        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() { return name; }
    public int getPrice() { return price; }
    public int getWeight() { return weight; }
}
