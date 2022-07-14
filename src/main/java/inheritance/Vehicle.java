package inheritance;

public abstract class Vehicle implements Sellable, Comparable<Vehicle>
{

    public String name;
    private int speed;
    private final int maxSpeed;
    private final int wheels;
    private final int seats;

    public Vehicle(int wheels, int seats, int maxSpeed)
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
    public int compareTo(Vehicle o)
    {
        return this.getSpeed() - o.getSpeed();
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

    @Override
    public String getStoreDisplayName() {
        return this.name;
    }

    public String display(int quantity, String productID) {
        return "{\n"
                + "        productID: " + productID
                + ",\n        quantity: " + quantity
                + ",\n        item: " + this.getStoreDisplayName()
                + ",\n        price: $" + this.getSalesPrice()
                + "\n    }";
    }


    @Override
    public String toString() {
        return this.name;
    }
}
