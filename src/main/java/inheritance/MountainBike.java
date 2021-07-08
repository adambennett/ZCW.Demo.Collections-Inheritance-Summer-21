package inheritance;

public class MountainBike extends Bicycle
{

    public int seatHeight;

    public MountainBike(int gear, int speed, int startHeight)
    {
        super(gear, speed);
        this.seatHeight = startHeight;
    }

    public void setHeight(int newValue)
    {
        this.seatHeight = newValue;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nseat height is " + seatHeight;
    }

}
