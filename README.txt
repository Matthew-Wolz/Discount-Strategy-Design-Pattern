# Shopping Cart Simulation with Strategy Pattern

This project simulates an online shopping cart using the Strategy design pattern in Java. The goal is to allow different discount strategies to be applied to an original price dynamically, demonstrating the power of encapsulation and interchangeability of algorithms.

## Classes

The assignment will incorporate the following classes for the Strategy pattern:

1. **DiscountStrategy.java** (Interface)
2. **NoDiscount.java** (Algorithm)
3. **PercentageDiscount.java** (Algorithm)
4. **FixedDiscount.java** (Algorithm)
5. **ShoppingCart.java**
6. **Main.java**

## Usage

1. Implement various discount algorithms by creating classes that implement the `DiscountStrategy` interface.
2. Use the `ShoppingCart` class to apply the selected discount strategy to the cart's total price.
3. Switch between discount strategies easily by changing the strategy object used in the `ShoppingCart` class.

## Example

```java
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Set a percentage discount strategy
        cart.setDiscountStrategy(new PercentageDiscount(10)); // 10% off
        System.out.println("Total with Percentage Discount: " + cart.calculateTotal(100));

        // Set a fixed discount strategy
        cart.setDiscountStrategy(new FixedDiscount(20)); // $20 off
        System.out.println("Total with Fixed Discount: " + cart.calculateTotal(100));

        // Set no discount strategy
        cart.setDiscountStrategy(new NoDiscount());
        System.out.println("Total with No Discount: " + cart.calculateTotal(100));
    }
}
