package inheritance;

public abstract class Automobile implements Vehicle, Comparable<Automobile>
{

    public String name;
    private int speed;
    private final int maxSpeed;
    private final int wheels;
    private final int seats;

    public Automobile(int wheels, int seats, int maxSpeed)
    {
        this.wheels = wheels;
        this.seats = seats;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.name = "";
    }

    public void applyBrake(int decrement)
    {
        this.speed -= decrement;
        if (this.speed < 0)
        {
            this.speed = 0;
        }
    }

    public void speedUp(int increment)
    {
        this.setSpeed(this.getSpeed() + increment);
    }

    public void setSpeed(int speed)
    {
        this.speed = speed > this.maxSpeed
                ? this.maxSpeed
                : Math.max(speed, 0);
    }

    @Override
    public int compareTo(Automobile o)
    {
        return this.getSpeed() - o.getSpeed();
    }

    @Override
    public String toString() {
        return name;
    }

    public int getSpeed()
    {
        return speed;
    }

    public int getWheels()
    {
        return wheels;
    }

    public int getSeats()
    {
        return seats;
    }

    public int getMaxSpeed()
    {
        return maxSpeed;
    }

}
