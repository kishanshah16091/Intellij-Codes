package util;

public class StringUtil {
    public static  boolean contains(String str, String regex){
        String newString=str.replaceAll(regex,"");
        return !newString.equals(str);


    }
}
