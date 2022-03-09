package Class22;

public class MethodOverloadingDemo2 {
    void printInfo(String name,int age,double weight){
        System.out.println("M1");
        System.out.println(name+" "+age+" "+weight);
    }
    void printInfo(int age,String name,double weight){
        System.out.println("M2");
        System.out.println(name+" "+age+" "+weight);
    }
    void printInfo(int age,double weight,String name){
        System.out.println("M3");
        System.out.println(name+" "+age+" "+weight);
    }
    void printInfo(double weight,int age,String name){
        System.out.println("M4");
        System.out.println(name+" "+age+" "+weight);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo2 methodOverloadDemo=new MethodOverloadingDemo2();
        methodOverloadDemo.printInfo("Zulfiya",16,28.0);
    }
}