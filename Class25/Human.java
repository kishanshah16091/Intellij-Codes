package Class25;

public interface Human {
//public static fina redundant because by default all the variable are public static final

    // public static final int legs=2;
    int legs = 2;

    // public abstract void walk();
    void walk();

    static void printLegs() {
        System.out.println(legs);

    }

    public default void noNeedToWorry() {
        System.out.println("Default methods are there to functional programming");

    }

    interface livingBeing {
        static void printLegs() {
            System.out.println("Not sure");
        }
    }

    class Maha implements Human {

        @Override
        public void walk() {
            System.out.println("I can walk");
        }
    }

    public static void main(String[] args) {
        Maha maha = new Maha();
        maha.walk();
        //Maha.printLegs();
        Human.printLegs();
        livingBeing.printLegs();
    }
}
