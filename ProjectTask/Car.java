package ProjectTask;


abstract class Car {
    /*Create  a  Class  Car  that  would  have  the following  fields:
      carPrice  and  color  and method calculateSalePrice() which should be returning a price of the car.
Create 2 sub classes: Sedan and Truck.
The Truck  class  has  field  as  weight and has its own implementation of calculateSalePrice() method
in which returned price calculated as following: if weight>2000 then returned price car should include 10% discount, otherwise
20% discount.
The Sedan class has field as length and also does  its own implementation of calculateSalePrice(): if length of sedan is >20
feet then returned car price should include
5% discount, otherwise 10% discount
     */
    String color;
    double carPrice;

    Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    abstract double calculateSalePrice();
}

class Sedan extends Car {
    int length;

    Sedan(double carPrice, String color, int length) {
        super(carPrice, color);
        this.length = length;
    }

    @Override
    double calculateSalePrice() {
        if (length > 20) {
            carPrice -= carPrice * 0.05;
        } else {
            carPrice -= carPrice * 0.1;
        }
        return carPrice;
    }
}

class Truck extends Car {
    double weight;

    Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    @Override
    double calculateSalePrice() {
        if (weight > 2000) {
            carPrice -= carPrice * 0.1;
        } else {
            carPrice -= carPrice * 0.2;
        }
        return carPrice;
    }

}

class CarTester {
    public static void main(String[] args) {
        Car s = new Sedan(10000.00, "white", 30);
        System.out.println(s.calculateSalePrice());

        Car t = new Truck(20000.00, "Black", 3000.0);
        System.out.println(t.calculateSalePrice());
    }
}

