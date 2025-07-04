
public class FawryQuantumChallenge {
    public static void main(String[] args) {
        try {

            Item cheese = new Item("Cheese", 100, 400);
            Item biscuits = new Item("Biscuits", 150, 700);
            Item tv = new Item("TV", 5000, 10000);
            Item pepsi = new Item("Pepsi", 13, 400);
            Item scratchCard = new Item("ScratchCard", 10, 10);

            Cart cart = new Cart();
            cart.add(cheese, 2);
            cart.add(biscuits, 1);
            cart.add(tv, 3);
            cart.add(pepsi, 2);
			cart.add(scratchCard, 1);

            Customer customer = new Customer("John Doe");
            Checkout.checkout(customer, cart);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
