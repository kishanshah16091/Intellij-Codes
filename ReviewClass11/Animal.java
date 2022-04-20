package ReviewClass11;

public class Animal {
    String name;
    String color;

    void Sleep() {
        System.out.println(" Animals sleep");
    }
}

class Dog extends Animal {
    void Sleep() {
        System.out.println("Dog sleeps in the day");
    }
}

class Cat extends Animal {
    void Sleep() {
        System.out.println("cat sleeps all the day");

    }

    void Eat() {
        System.out.println("we like to eat fish");
    }
}

class Test2 {
    public static void main(String[] args) {
        //Cat cat new=Dog(); down casting
        Animal animal = new Dog();// upcasting
        animal.Sleep();
        //animal.eat(); we can't use the method that are specific to cat class only because right now it is behaving as an animal
        //Dog dog = (Dog) animal;
        //  dog.Sleep();
        method(new Dog());
    }

    public static void method(Animal animal) {
        if (animal instanceof Cat) {
            ((Cat) animal).Eat();
        } else {
            System.out.println("you are not passing a cat inside the box animal");
        }
    }
}