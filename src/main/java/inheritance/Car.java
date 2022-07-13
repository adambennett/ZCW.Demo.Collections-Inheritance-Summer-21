package inheritance;

public class Car extends Vehicle
{

    public Car(int wheels, int seats)
    {
        super(wheels, seats, 120);
    }

    @Override
    public int getSalesPrice() {
        return 25000;
    }
}
