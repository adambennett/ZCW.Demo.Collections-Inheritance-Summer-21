package inheritance;

public class Bicycle implements Vehicle
{

    private final int gear;
    private int speed;

    public Bicycle(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrake(int decrement)
    {
        this.speed -= decrement;
    }

    public void speedUp(int increment)
    {
        this.speed += increment;
    }

    public String toString()
    {
        return ("No of gears are " + gear + "\nspeed of bicycle is " + speed);
    }

    public int getGear()
    {
        return gear;
    }

    public int getSpeed()
    {
        return speed;
    }
}
