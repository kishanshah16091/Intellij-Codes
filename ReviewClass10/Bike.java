package ReviewClass10;

public class Bike {
    int maxSpeed = 100;
    int engineCC = 125;

    void printMaxSpeed() {
        System.out.println(maxSpeed);
    }

    void EngineCC() {
        System.out.println("engineCC");
    }
}
class HondaBikes extends Bike {
    int maxSpeed = 150;
    int engineCC = 125;
    void printEngineCC() {System.out.println(engineCC);}
    void printMaxSped(){

        int maxSpeed = 200;
        System.out.println(maxSpeed);//100
        System.out.println(this.maxSpeed);//Child class variable //150
        System.out.println(super.maxSpeed);//parents class variable//200
    }
    void printInfoFromParentAndChild(){
        printEngineCC();
        this.printEngineCC();

        }
}
