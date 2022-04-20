package Class25;

public interface Healthy {
    void Healthy();

}
interface Portable{
 void canCarry();

}
interface Eatable{
    void eat();
}
class Orange implements Healthy, Portable, Eatable{

    @Override
    public void Healthy() {
        System.out.print("Oranges is healthy to eat");
    }

    @Override
    public void canCarry() {
        System.out.print("we can carry orange easily");
    }

    @Override
    public void eat() {
        System.out.print("we can eat orange");
    }
}
class Laptop implements Portable{

    @Override
    public void canCarry() {
        System.out.println("We can carry a laptop easily");
    }
}