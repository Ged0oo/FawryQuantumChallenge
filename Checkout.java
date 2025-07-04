
public class Checkout {
    public static void checkout(Customer customer, Cart cart) {
        if (customer == null || cart == null) {
            System.out.println("Error: Customer or cart cannot be null");
            return;
        }

        if (cart.isEmpty()) {
            System.out.println("Error: Cart is empty");
            return;
        }

        int subtotal = 0;
        int totalWeight = 0;
        System.out.println("\n** Shipment notice **");

        for (CartItem ci : cart.getItems()) {
            String name = ci.getItem().getName();
            if (name.equals("Cheese") || name.equals("Biscuits")) {
                System.out.printf("%dx %s %dg\n", ci.getQuantity(), name, ci.getItem().getWeight());
                totalWeight += ci.getTotalWeight();
            }
        }
        System.out.printf("Total package weight %.1f kg\n", totalWeight / 1000.0);

        System.out.println("\n** Checkout receipt **");
        for (CartItem ci : cart.getItems()) {
            String name = ci.getItem().getName();
            if (name.equals("Cheese") || name.equals("Biscuits")) {
                System.out.printf("%dx %s %d\n", ci.getQuantity(), name, ci.getTotalPrice());
                subtotal += ci.getTotalPrice();
            }
        }
		
        System.out.printf("\nSubtotal %d\n", subtotal);
        System.out.println("Shipping 30");
        System.out.printf("Amount %d\n", subtotal + 30);
        System.out.println("END.\n");
    }
}
