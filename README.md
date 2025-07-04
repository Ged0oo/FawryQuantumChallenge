# Fawry Quantum E-Commerce System

This project is a simple e-commerce system designed for the Fawry Quantum Internship Challenge.  
It demonstrates product management, cart operations, checkout, and shipping logic.

## Class Overview

### Item
- **Fields:** `name`, `price`, `weight`
- **Description:** Represents a product in the system. Does not track quantity or expiry in the current implementation.

### CartItem
- **Fields:** `Item item`, `int quantity`
- **Methods:** `getItem()`, `getQuantity()`, `getTotalPrice()`, `getTotalWeight()`
- **Description:** Represents an item and its quantity in the cart.

### Cart
- **Fields:** `List<CartItem> items`
- **Methods:** `add(Item, int)`, `getItems()`, `isEmpty()`
- **Description:** Holds cart items and provides methods to add items and check if the cart is empty.

### Customer
- **Fields:** `name`
- **Description:** Represents a customer. The current implementation does not track balance.

### Checkout
- **Methods:** `checkout(Customer, Cart)`
- **Description:** Handles checkout logic, prints shipment and receipt.  
  - Prints a shipment notice for Cheese and Biscuits only.
  - Calculates subtotal and adds a fixed shipping fee (30).
  - Prints a formatted receipt.
  - Handles empty cart and null checks for customer/cart.
  - Does not check for product expiry, stock, or customer balance.

---

## How to Run

1. Compile all `.java` files:
   ```
   javac *.java
   ```
2. Run the main class:
   ```
   java FawryQuantumChallenge
   ```

---

## Example Output

```
** Shipment notice **
2x Cheese 400g
1x Biscuits 700g
Total package weight 1.1 kg

** Checkout receipt **
2x Cheese 200
1x Biscuits 150

Subtotal 350
Shipping 30
Amount 380
END.
```

---

## Terminal Example

Below is a screenshot of compiling and running the project:

![Terminal Example](./terminal_output.png)

---

## Notes

- The system prints a shipment notice only for Cheese and Biscuits.
- Shipping fee is fixed at 30.
- No checks for product expiry, stock, or customer balance are implemented.
- Only the items Cheese and Biscuits are considered shippable in the