package ReviewClass8;

public class Class2 {
    String generateUsername(String firstName, String lastName){

        return firstName+"123"+lastName+".com";
    }
 static void kishanDemand(){
        System.out.println("This is Kishan demand");
}
    public static void main(String[] args) {
        kishanDemand();
        Class2 obj=new Class2();
        System.out.println(obj.generateUsername("Kishan", "Shan"));
    }
}
