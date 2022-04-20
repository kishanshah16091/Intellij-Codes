package Class26;

public class ShoppingCart {
    private double originalPrice=100;
    private double discount = .15;

    void setDiscount(double discount){
        if(discount>0&&discount<=.15){
            this.discount=discount;
        }else {
            System.out.println("Can't have that much discount");
        }
    }
    public double getDiscount(){
        return discount;
    }
    void calculatePrice() {
        double price = originalPrice - (originalPrice * discount);
        System.out.println(price);
    }
}