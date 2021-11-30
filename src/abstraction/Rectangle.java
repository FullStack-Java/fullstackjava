package abstraction;

public class Rectangle extends Shape{

    @Override
    double area(int length1, int width) {
        return length1 * width;
    }

    public static void main(String[] args) {
        Rectangle demo = new Rectangle();
        System.out.println(demo.area(2,3));
    }
}
