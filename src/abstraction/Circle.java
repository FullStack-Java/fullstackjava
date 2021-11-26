package abstraction;

public class Circle extends GraphObject {

    @Override
    void draw() {
        System.out.println("Drawing a cicle");
    }

    @Override
    void resize() {
        System.out.println("Resizing the Circle");
    }


}
