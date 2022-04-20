package Class26;

public class ShoppingCartTester {

    public static void main(String[] args) {
        ShoppingCart shoppingCart=new ShoppingCart();
       // shoppingCart.originalPrice=100;
       // shoppingCart.discount=.20;
       // shoppingCart.setDiscount(.50);
        //shoppingCart.calculatePrice();
        System.out.print(shoppingCart.getDiscount());
        shoppingCart.calculatePrice();
    }

}


