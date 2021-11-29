package polymorphism;

public class BicycleOR {

    protected int gear;
    protected int speed;

    public BicycleOR(int startSpeed, int startGear){
        gear= startGear;
        speed = startSpeed;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void applyBreak(int decrement){
        speed -= decrement;
    }

    public void speedUp(int increment){
        speed +=increment;
    }
}
