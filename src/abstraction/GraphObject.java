package abstraction;

public abstract class GraphObject {
    //An abstract class must have at least one abstract method
//   If want to create an implementation of the abstact methods,
//   we have to extend the class

//    No constuctor should be initialized in an abstract class
    int x,y;

    void moveTo(){
        System.out.println("move to x: " + x + " and y: " + y);
    }

    abstract void draw();
    abstract  void resize();


}
