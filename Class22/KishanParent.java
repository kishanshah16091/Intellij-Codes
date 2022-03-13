package Class22;

public class KishanParent {
    String girlName="Salma";
    double money=10000000;
    void marry(){
        System.out.println("Kishan you should marry "+girlName);

    }
}
class Kishan extends KishanParent{
    String girlName="Rihanna";
    void marry(){
        super.marry();
        System.out.println("But dad i want to marry "+girlName);
    }
}