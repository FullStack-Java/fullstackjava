package superKeyword;

public class Truck extends Vehicles {

    String wheels = "Trucks have 12 wheels";

    public void printWheels(){
        System.out.println(wheels);
        System.out.println(super.wheels);
    }

    public static void main(String[] args) {
        Truck trailer = new Truck();
        trailer.printWheels();
        Vehicles t = new Truck();
        t.pWheels();
        
    }
}
