package JavaMaps;

import java.util.Map;
import java.util.HashMap;

public class HashMaps1 {

    public static void main(String[] args) {
        HashMap<String, Integer> hmaps = new HashMap<String, Integer>();

        hmaps.put("Var-1" , 1);
        hmaps.put("Var-2" , 2);
        hmaps.put("Var-3" , 3);
        hmaps.put("Var-4" , 4);

        System.out.println(hmaps);
        System.out.println(hmaps.size());
        System.out.println(hmaps.containsKey("Var-1"));

        if (hmaps.containsKey("Var-1")){
            System.out.println(hmaps.get("Var-1"));
        }

        for (String a: hmaps.keySet()) {
            System.out.println(hmaps.get(a));
        }

        for(Map.Entry<String, Integer> entry: hmaps.entrySet()){
            System.out.println("Key - " + entry.getKey() + ", value: " + entry.getValue());
        }

    }


}
