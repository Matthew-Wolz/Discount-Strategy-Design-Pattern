public class PercentageDiscount implements DiscountStrategy{
    double percentage;
    public PercentageDiscount(double percentage){
        this.percentage = percentage;
    }

    @Override
    public double applyDiscount(double originalPrice){
        return originalPrice - (percentage / 100.0) * originalPrice;
    }
}
