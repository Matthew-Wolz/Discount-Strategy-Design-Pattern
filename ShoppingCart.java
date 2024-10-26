public class ShoppingCart{
    private DiscountStrategy discount;

    public ShoppingCart(DiscountStrategy discount){
        this.discount = discount;
    }

    public double calculateTotal(double originalPrice){
        return discount.applyDiscount(originalPrice);
    }

}
