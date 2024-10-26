public class main{
    public static void main(String[] args){
        double originalPrice = 100.0;

        ShoppingCart cart1 = new ShoppingCart(new NoDiscount());
        ShoppingCart cart2 = new ShoppingCart(new PercentageDiscount(10));
        ShoppingCart cart3 = new ShoppingCart(new FixedDiscount(20));

        System.out.println("Cart 1 Total: " + cart1.calculateTotal(originalPrice));
        System.out.println("Cart 2 Total: " + cart2.calculateTotal(originalPrice));
        System.out.println("Cart 3 Total: " + cart3.calculateTotal(originalPrice));
    }
}