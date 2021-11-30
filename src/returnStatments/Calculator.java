package returnStatments;

public class Calculator {

    private Integer add(int var1, int var2){
//        Demonstration pass by value.
        var1 = 100;
        return var1 + var2;
    }
    public static void main(String[] args) {
        int var1 = 3;
        Calculator numbers = new Calculator();
        System.out.println("Before: " + var1);
        System.out.println(numbers.add(var1,2));
        System.out.println("After: " + var1);
    }
}
