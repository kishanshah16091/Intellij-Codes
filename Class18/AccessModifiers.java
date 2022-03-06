package Class18;

public class AccessModifiers {
    Private String name ="Naughty Trik";
    int age; //default access
    protected double weight=50;
    public String color="White";



    public static void main(String[] args) {
        AccessModifiers am=new AccessModifiers();
        System.out.print(am.name);
        System.out.print(am.age);
        System.out.print(am.weight);
        System.out.print(am.color);
    }
}
