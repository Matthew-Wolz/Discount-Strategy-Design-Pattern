public class FixedDiscount implements DiscountStrategy{
    double discountAmount;
    public FixedDiscount(double discountAmount){
        this.discountAmount = discountAmount;
    }

    @Override
    public double applyDiscount(double originalPrice){
        return originalPrice - discountAmount;
    }
}
