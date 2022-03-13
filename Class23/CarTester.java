package Class23;

public class CarTester {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.start();
        Suzuki suzuki = new Suzuki();
        suzuki.park();
        System.out.println("--------------------------------------------");
        Car car = new BMW();
        car.stop();
        car.start();
    }
}
