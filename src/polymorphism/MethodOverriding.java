package polymorphism;

import java.util.Arrays;

public class MethodOverriding {

    public static void main(String[] args) {

        BicycleOR bicycle = new BicycleOR(10,1);
        System.out.println("Bicycle Gear is " + bicycle.gear);
        System.out.println("Bicycle Speed is " + bicycle.speed);

        bicycle.applyBreak(1);
        System.out.println("Bicycle Speed is " + bicycle.speed);

        System.out.println();

    }
}
