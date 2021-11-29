package polymorphism;

public class MethodOverloading {

//    use method overloading with caution
    public int multiply(int x, int y){
        return  x *  y;
    }

    public int multiply(int x, int y, int z){
        return  x * y * z;
    }

    public static void main(String[] args) {
        MethodOverloading result = new MethodOverloading();
        System.out.println(result. multiply(10,20,30));

    }
}
