package Class20;

public class Lion extends Animal {
    boolean huntOthers = true;

    void roar() {
        System.out.println(name + " is roaring color=" + color + " hunterOther " + huntOthers);
    }

    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.name = "Alex";
        lion.color = "pink";
        lion.sleep();
        lion.roar();
    }
}
