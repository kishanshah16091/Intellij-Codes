package Class33;

import Class23.Dog;

public class NullPointerDemo {
    public static void main(String[] args) {
        String str = null;
        //we get the null pointer exception when a method is called an object which is not initialized
        // str.length();

        Dog dog = null;
        //  dog.toString();
        int[] arr = new int[-5];

    }
}
