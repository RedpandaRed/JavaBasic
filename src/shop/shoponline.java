package shop;

public class shoponline {
    public static void main(String[] args) {
        System.out.println("Shop-online for customers");
        System.out.println("Today online, we have 20% off on all products.");
        int price = 400;
        float discount = 0.2F;
        float discounted_price = price - (discount * price);
        System.out.println("Only today, get the Acer Aspire 5 for just $" + discounted_price + "!!!");
    }
}
