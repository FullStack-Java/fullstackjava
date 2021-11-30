package JavaMaps;

import java.util.TreeMap;

public class TreeMaps1 {

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

        treeMap.put(3, "A");
        treeMap.put(2,"B");
        treeMap.put(1, "C");

        System.out.println(treeMap);
    }
}
