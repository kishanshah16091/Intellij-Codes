package ReviewClass13;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {
    public static void main(String[] args) {

        HashMap<Integer,String> personInfo=new HashMap<>();
        personInfo.put(11111, "Manana");
        personInfo.put(156461, "Salim");
        personInfo.put(145351, "Gulden");
        personInfo.put(114545, "Pot");
        personInfo.put(432411, "Eric");
        for(Map.Entry<Integer,String> entry: personInfo.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
