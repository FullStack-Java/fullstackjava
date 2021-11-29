package CollectionsSets;

import java.util.HashSet;
import java.util.Set;


public class HashSet1 {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<String>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A");

        System.out.println(hashSet);
        System.out.print("Does the hashset contains C? : " ); if(hashSet.contains("C")) System.out.println(" yes");

        hashSet.remove("A");
        System.out.println("Set After Removing A: " + hashSet);

        for (String item: hashSet) {
            System.out.println(item);
        }


    }




}
