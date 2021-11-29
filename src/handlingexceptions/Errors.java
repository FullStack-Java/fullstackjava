package handlingexceptions;

import java.util.ArrayList;
import java.util.List;

public class Errors {

    public void writeList(){
        try {
            List<Integer> list = new ArrayList<>(10);
            list.add(9);

            System.out.println("THE TRY STATEMENT HAS BEEN ENTERED!");
            Integer arrItem = list.get(1);
            System.out.println("Accessing the First Element: " + arrItem);



        }catch (IndexOutOfBoundsException error){
            System.out.println("Index Out of Bounds " + error);

        }finally{
            System.out.println("Ths will always be executed!");
        }
    }

    public static void main(String[] args) {
        Errors err = new Errors();
        err.writeList();
    }
}
