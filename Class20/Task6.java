package Class20;

public class Task6 {
    //Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    //Instance variables are being initialized
    //Both Constructors are being executed

    String bookName;
    double price;

    public Task6(){

        System.out.println("No argument constructor");
    }

    public Task6(String bookName, double price) {
        this();// use to call this() inside the another constructor
        this.bookName = bookName;
        this.price = price;
        System.out.print("Two argument constructor");
    }
}

