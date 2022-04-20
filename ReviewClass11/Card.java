package ReviewClass11;

public abstract class Card {
    abstract void showInterest();
       // abstract String name; not allowed
      //private  abstract void showInterest(); not allowed
     // Static  abstract void showInterest(); not allowed
    // abstract final void showInterest();  not allowed
    // abstract Card(){} don't participate in inheritance
}

abstract class Visa extends Card {
    @Override
    void showInterest() {
        //super.showInterest(); no body inside the parent class we can't call it

        System.out.println("23%");
    }

}