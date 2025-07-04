
public class Customer {
    private String name;

    public Customer(String name) {
        if (name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("Customer name cannot be null or empty");
        this.name = name;
    }

    public String getName() { return name; }
}
