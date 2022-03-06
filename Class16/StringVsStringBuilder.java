package Class16;

public class StringVsStringBuilder {
    public static void main(String[] args) {
        String s= new String("Asghar Is Great");//original string
        s.concat("haha");//add ne string haha to string
      // System.out.println( s.replace(" ",""));
        System.out.println(s);//printing out the original string
    StringBuilder stringBuilder=new StringBuilder("Asghar Is Great");//original string
        stringBuilder.append ("haha");//add ne string haha to string
    //System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder);//printing out the original string





    }
}
