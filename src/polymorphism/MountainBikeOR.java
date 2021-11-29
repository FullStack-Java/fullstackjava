package polymorphism;

public class MountainBikeOR extends BicycleOR {

    public int seatHeight;

    public MountainBikeOR(int startSpeed, int startGear, int startHeight) {
        super(startSpeed, startGear);
        seatHeight = startHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }
//  Providing their own implementation of the base class.
    @Override
    public void setGear(int gear) {
//        super.setGear(gear); don't fully understand here
    }

    @Override
    public void applyBreak(int decrement) {
//        super.applyBreak(decrement);
        speed = speed - decrement - 10;

    }

    @Override
    public void speedUp(int increment) {
//        super.speedUp(increment);
        speed = speed + increment + 10;
    }
}
