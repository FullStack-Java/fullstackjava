package CollectionsSets;

import java.util.TreeSet;

public class TreeSets1 {
//    Use when you want to maintain the natural order of the element is maintained.
    public static void main(String[] args) {

        TreeSet<String> tset = new TreeSet<String>();
        tset.add("B");
        tset.add("A");
        tset.add("A");
        tset.add("A");
        tset.add("V");
        tset.add("C");


        System.out.println(tset);

    }
}
