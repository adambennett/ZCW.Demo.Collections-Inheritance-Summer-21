package inheritance;

public class Bicycle extends Vehicle implements Sellable
{

    private final int gear;
    private int speed;
    private int salePrice = -1;

    public Bicycle(int gear, int speed)
    {
        super(1, 1, 30);
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
        return ("No of gears are " + gear + "\nSpeed of bicycle is " + speed);
    }

    public int getGear()
    {
        return gear;
    }

    public int getSpeed()
    {
        return speed;
    }

    public void setSalePrice(int salePrice) { this.salePrice = salePrice; }

    @Override
    public int getSalesPrice() {
        return this.salePrice != -1 ? this.salePrice : 250;
    }
}
