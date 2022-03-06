package Class16;

public class ClassTask3 {
    public static void main(String[] args) {

        //You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?
        // ” How would you find out how many sentences are in that String?


        String a = "Is it saturday? Is it raining? Do we have a Java Class today?";
        // String class method to count  the number of characters in a class
        System.out.println(a.length());
        // length property that we can use to check the number of elements in a array
        System.out.println(a.split("[?.!]").length);
    }
}
